package flyweight_prototype;

import flyweight_prototype.desease.InfectedCell;
import flyweight_prototype.immunesystem.Antibody;
import flyweight_prototype.immunesystem.ImmuneResponse;
import flyweight_prototype.immunesystem.Receptor;
import flyweight_prototype.immunesystem.Thymus;
import flyweight_prototype.immunesystem.cells.*;
import flyweight_prototype.desease.Virus;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Organism {

	private static final int CELL_COUNT = 5000;
	private static final int DENDRITIC_CELL_COUNT = 100;
	private static final int CLONE_COUNT = 1000;

	private final Thymus thymus = new Thymus();
	private final List<Cell> cells = new ArrayList<>();
	private final List<InfectedCell> infectedCells = new ArrayList<>();

	private final List<TCell> tCells = new ArrayList<>();
	private final List<BCell> bCells = new ArrayList<>();
	private final List<DendriticCell> dendriticCells = new ArrayList<>();

	private List<Virus> viruses = new ArrayList<>();
	private final List<Antibody> antibodies = new ArrayList<>();

	private ImmuneResponse immuneResponse = ImmuneResponse.SEARCH_FOR_VIRUSES;

	private boolean started;

	public void born() {

		for (int i = 0; i < CELL_COUNT; i++) {
			cells.add(new Cell());
		}

		for (int i = 0; i < DENDRITIC_CELL_COUNT; i++) {
			dendriticCells.add(new DendriticCell());
		}

		int tCellCount = Generator.nextInt(1000);
		for (int i = 0; i < tCellCount; i++) {
			tCells.add(thymus.createTCell());
		}

		int bCellCount = Generator.nextInt(1000);
		for (int i = 0; i < bCellCount; i++) {
			bCells.add(thymus.createBCell());
		}

	}

	public void step() {

		killMarkedCells();
		spreadNewViruses();

		infectNewCells();

		switch (immuneResponse) {
			case SEARCH_FOR_VIRUSES: {
				findVirus();
				break;
			}
			case ACTIVATING_LYMPHOCYTES: {
				activateLymphocytes();
				break;
			}
			case CLONING_LYMPHOCYTES: {
				cloneLymphocytes();
				break;
			}
			case TARGETING_INFECTED_CELLS: {
				markInfectedCells();
				spreadAntibodies();
				break;
			}
		}
	}

	public void infect(Virus virus, int count) {
		List<Virus> viruses = IntStream.range(0, count).mapToObj(i -> (Virus) virus.clone()).collect(Collectors.toList());
		this.viruses.addAll(viruses);
	}

	public int cellCount() {
		return this.cells.size();
	}

	public boolean end() {
		return cellCount() == 0 || (started && this.immuneResponse == ImmuneResponse.SEARCH_FOR_VIRUSES);
	}

	public int infectedCellCount() {
		return this.infectedCells.size();
	}

	public int deadCellCount() {
		return CELL_COUNT - (cellCount() + infectedCellCount());
	}

	public int virusCount() {
		return this.viruses.size();
	}

	public int antibodiesCount() {
		return this.antibodies.size();
	}

	public long getActivatedBCellCount() {
		return bCells.stream().filter(BCell::isActive).count();
	}

	public long getActivatedTCellCount() {
		return tCells.stream().filter(TCell::isActive).count();
	}

	public ImmuneResponse getImmuneResponse() {
		return this.immuneResponse;
	}

	private void cloneLymphocytes() {

		List<TCell> tCells = new ArrayList<>();
		List<BCell> bCells = new ArrayList<>();

		for (TCell tCell: this.tCells) {
			if (tCell.isActive()) {
				tCells.addAll(IntStream.range(0, CLONE_COUNT).mapToObj(clone -> (TCell) tCell.clone()).collect(Collectors.toList()));
			}
		}

		for (BCell bCell: this.bCells) {
			if (bCell.isActive()) {
				bCells.addAll(IntStream.range(0, CLONE_COUNT).mapToObj(clone -> (BCell) bCell.clone()).collect(Collectors.toList()));
			}
		}

		this.tCells.addAll(tCells);
		this.bCells.addAll(bCells);

		immuneResponse = ImmuneResponse.TARGETING_INFECTED_CELLS;
	}

	private void activateLymphocytes() {

		int length = Math.max(tCells.size(), bCells.size());

		for (DendriticCell dendritic : dendriticCells) {
			if (!dendritic.hasReceptor()) {
				continue;
			}

			for (int i = 0; i < length; i++) {

				if (i < tCells.size()) {
					dendritic.activate(tCells.get(i));
				}

				if (i < bCells.size()) {
					dendritic.activate(bCells.get(i));
				}
			}
		}
		immuneResponse = ImmuneResponse.CLONING_LYMPHOCYTES;
		started = true;
	}

	private void findVirus() {
		for (DendriticCell dCell : dendriticCells) {
			findInfectedCell().ifPresent(infCell -> {
				dCell.takeSample(infCell);
				immuneResponse = ImmuneResponse.ACTIVATING_LYMPHOCYTES;
			});
		}
	}

	private void killMarkedCells() {

		for (TCell cell : tCells) {
			IntStream.range(0, 50).forEach(i -> findAntibody().filter(cell::match).ifPresent(antibody -> infectedCells.remove(antibody.getCell())));
		}

		if (viruses.isEmpty()) {
			immuneResponse = ImmuneResponse.SEARCH_FOR_VIRUSES;
		}
	}

	private void spreadNewViruses() {

		InfectedCell cell;
		for (int i = 0; i < infectedCells.size(); i++) {
			cell = infectedCells.remove(i);
			viruses.addAll(cell.releaseViruses());
		}
	}

	private void infectNewCells() {

		AtomicInteger virusesToRemove = new AtomicInteger();

		IntStream.range(0, viruses.size()).forEach(i ->

				findCell().ifPresent(cell -> {
					cells.remove(cell);
					virusesToRemove.getAndIncrement();
					infectedCells.add(new InfectedCell(viruses.get(i)));
				})
		);

		viruses = viruses.subList(0, viruses.size() - virusesToRemove.get());
	}

	private void markInfectedCells() {

		for (Antibody antibody : antibodies) {

			if (antibody.cellAttached()) {
				continue;
			}

			findInfectedCell().ifPresent(antibody::attachCell);
		}
	}

	private void spreadAntibodies() {
		for (BCell cell : bCells) {
			if (cell.isActive()) {
				antibodies.addAll(cell.releaseAntibodies());
			}
		}
	}

	private Optional<Antibody> findAntibody() {

		Optional<Antibody> antibodyFound = Optional.empty();

		if (!antibodies.isEmpty()) {

			int randomIndex = Generator.nextInt(antibodies.size());

			if (randomIndex >= 0 && randomIndex < antibodies.size()) {
				antibodyFound = Optional.of(antibodies.get(randomIndex));
			}
		}

		return antibodyFound;
	}

	private Optional<Cell> findCell() {

		Optional<Cell> cellFound = Optional.empty();
		int randomIndex = Generator.nextInt((cells.size() + infectedCells.size()));

		if (randomIndex >= 0 && randomIndex < cells.size()) {
			cellFound = Optional.of(cells.get(randomIndex));
		}

		return cellFound;
	}

	private Optional<InfectedCell> findInfectedCell() {

		Optional<InfectedCell> cellFound = Optional.empty();
		int randomIndex = Generator.nextInt((cells.size() + infectedCells.size()));

		if (randomIndex >= 0 && randomIndex < infectedCells.size()) {
			cellFound = Optional.of(infectedCells.get(randomIndex));
		}

		return cellFound;
	}
}
