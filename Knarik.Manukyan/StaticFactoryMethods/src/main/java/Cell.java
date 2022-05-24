public class Cell {
	boolean hasNucleus;
	double size;
	DNAFormEnum DNAForm;
	boolean isUnicellular;
	boolean hasCapsule;

	private Cell(boolean hasNucleus, double size, DNAFormEnum DNAForm, boolean isUnicellular, boolean hasCapsule) {
		this.hasNucleus = hasNucleus;
		this.size = size;
		this.DNAForm = DNAForm;
		this.isUnicellular = isUnicellular;
		this.hasCapsule = hasCapsule;
	}

	// The two methods bellow have the same signature, but return different objects
	// This cannot be done with constructors
	static Cell createProkaryoticCell(double size, boolean hasCapsule) {
		return new Cell(false, size, DNAFormEnum.CIRCULAR, true, hasCapsule);
	}

	static Cell createEukaryoticCell(double size, boolean isUnicellular) {
		return new Cell(true, size, DNAFormEnum.LINEAR, isUnicellular, false);
	}

	// This method returns different subtypes of Cell class, which are private
	// This cannot be done with constructors
	static Cell createEukaryoticCell(double size, int numberOfChloroplasts, boolean isUnicellular) {
		if(numberOfChloroplasts <= 0){
			return new AnimalCell(size, isUnicellular);
		}
		return new PlantCell(size, isUnicellular, numberOfChloroplasts);
	}

	String getType(){
		return "Cell";
	}

	private static class AnimalCell extends Cell {
		private AnimalCell(double size, boolean isUnicellular) {
			super(true, size, DNAFormEnum.LINEAR, isUnicellular, false);
		}

		@Override
		String getType(){
			return "Animal Cell";
		}
	}

	private static class PlantCell extends Cell {
		int numberOfChloroplasts;
		private PlantCell(double size, boolean isUnicellular, int numberOfChloroplasts) {
			super(true, size, DNAFormEnum.LINEAR, isUnicellular, false);
			this.numberOfChloroplasts = numberOfChloroplasts;
		}

		@Override
		String getType(){
			return "Plant Cell";
		}
	}

}

enum DNAFormEnum {
	CIRCULAR, LINEAR
}
