public class MusicRecord {
	Performer performer;
	String name;
	int year;

	MusicRecord(Performer performer, String name, int year) {
		this.performer = performer;
		this.name = name;
		this.year = year;
	}

	public void play() {
		System.out.printf("Playing \"%s\" by %s from %d. The genre is %s. Enjoy!%n", name, performer.getName(), year, performer.getGenre());
	}
}
