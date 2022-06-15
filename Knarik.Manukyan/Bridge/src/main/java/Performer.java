public interface Performer {
	String getName();

	String getCountry();

	Genre getGenre();

}

enum Genre {
	COUNTRY, CLASSICAL, ROCK, POP, HIP_HOP, JAZZ, FOLK
}
