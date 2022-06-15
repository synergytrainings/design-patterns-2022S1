import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Artist Mercury = new Artist(Genre.ROCK, "Freddie Mercury", "England", new MusicalInstrument[]{MusicalInstrument.PIANO});
		Artist May = new Artist(Genre.ROCK, "Brian May", "England", new MusicalInstrument[]{MusicalInstrument.GUITAR});
		Artist Taylor = new Artist(Genre.ROCK, "Roger Taylor", "England", new MusicalInstrument[]{MusicalInstrument.DRUMS});
		Artist Deacon = new Artist(Genre.ROCK, "John Deacon", "England", new MusicalInstrument[]{MusicalInstrument.BASS});

		Band Queen = new Band("Queen", Arrays.asList(Mercury, May, Taylor, Deacon), Mercury, Genre.ROCK, 1970);

		RockMusicRecord rockMusicRecord = new RockMusicRecord(Queen, "Love of My Life", 1975, "Roy Thomas Baker", "A Night at the Opera");
		rockMusicRecord.play();

		Artist Domingo = new Artist(Genre.CLASSICAL, "Plácido Domingo", "Spain", null);

		ClassicalMusicRecord classicalMusicRecord = new ClassicalMusicRecord(Domingo, 1983, "Giuseppe Verdi", "La Traviata");
		classicalMusicRecord.play();

	}
}
