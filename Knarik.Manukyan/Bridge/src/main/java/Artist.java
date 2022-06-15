public class Artist implements Performer {
	Genre genre;
	String name;
	String country;
	MusicalInstrument[] musicalInstrument;

	public Artist(Genre genre, String name, String country, MusicalInstrument[] musicalInstrument) {
		this.genre = genre;
		this.name = name;
		this.country = country;
		this.musicalInstrument = musicalInstrument;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getCountry() {
		return country;
	}

	@Override
	public Genre getGenre() {
		return genre;
	}
}

enum MusicalInstrument {
	GUITAR, PIANO, BASS, DRUMS, VIOLIN, VIOLA
}
