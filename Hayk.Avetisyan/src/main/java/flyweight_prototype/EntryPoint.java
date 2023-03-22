package flyweight_prototype;

import flyweight_prototype.desease.Virus;
import flyweight_prototype.immunesystem.Receptor;

public class EntryPoint {

	public static void main(String[] args) {
		Organism organism = new Organism();
		organism.born();

		Virus virus = generateRandomVirus();
		organism.infect(virus, 10);

		while (!organism.end()) {
			organism.step();
			printState(organism);
		}
	}

	private static void printState(Organism organism) {
		clearConsole();

		StringBuilder buffer = new StringBuilder("__________ Organism :" + (organism.cellCount() > 0 ? "alive" : "dead ") + " __________");

		buffer.append("\nCell Count: ");
		buffer.append(organism.cellCount());

		buffer.append("\nInfected Cell Count: ");
		buffer.append(organism.infectedCellCount());

		buffer.append("\nDead Cell Count: ");
		buffer.append(organism.deadCellCount());

		buffer.append("\nActivated B Cells: ");
		buffer.append(organism.getActivatedBCellCount());

		buffer.append("\nActivated T Cells: ");
		buffer.append(organism.getActivatedTCellCount());

		buffer.append("\nAntibody Count: ");
		buffer.append(organism.antibodiesCount());

		buffer.append("\nVirus Count: ");
		buffer.append(organism.virusCount());

		buffer.append("\nImmune Response: ");
		buffer.append(organism.getImmuneResponse());

		buffer.append("\n______________________________________\n\n\n");

		System.out.println(buffer);
	}

	private static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");

			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls").waitFor();
			} else {
				Runtime.getRuntime().exec("clear").waitFor();
			}
		} catch (final Exception ignore) {
		}
	}

	private static Virus generateRandomVirus() {
		return new Virus(new Receptor(Generator.nextKey()));
	}
}
