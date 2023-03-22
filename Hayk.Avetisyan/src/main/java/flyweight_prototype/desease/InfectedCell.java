package flyweight_prototype.desease;

import flyweight_prototype.Generator;
import flyweight_prototype.immunesystem.Receptor;
import flyweight_prototype.immunesystem.cells.Cell;
import flyweight_prototype.immunesystem.cells.DendriticCell;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class InfectedCell extends Cell {

	private final Virus virus;

	public Optional<Receptor> getVirusReceptor(DendriticCell dCell) {
		return dCell.hasReceptor() ? Optional.empty() : Optional.of(virus.getReceptor());
	}

	public InfectedCell(Virus virus) {
		this.virus = virus;
	}

	public Collection<Virus> releaseViruses() {

		Collection<Virus> viruses = new ArrayList<>();
		try {
			int count = Generator.nextInt(10);

			for (int i = 0; i < count; i++) {
				viruses.add((Virus) virus.clone());
			}
		} catch (Exception ignore) {}

		return viruses;
	}
}
