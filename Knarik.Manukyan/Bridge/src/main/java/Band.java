import java.util.List;
import java.util.stream.Collectors;

public class Band implements Performer{
	List<Artist> artists;
	Artist leadArtist;
	String bandName;
	Genre genre;
	int startYear;

	public Band(String bandName, List<Artist> artists, Artist leadArtist, Genre genre, int startYear) {
		this.bandName = bandName;
		this.artists = artists;
		this.leadArtist = leadArtist;
		this.genre = genre;
		this.startYear = startYear;
	}

	@Override
	public String getName() {
		return bandName + " (" + artists.stream().map(Artist::getName).collect(Collectors.joining(", ")) + ")";
	}

	@Override
	public String getCountry() {
		return artists.stream().map(Artist::getCountry).distinct().collect(Collectors.joining(", "));
	}

	@Override
	public Genre getGenre() {
		return genre;
	}
}
