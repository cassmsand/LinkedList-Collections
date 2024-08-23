/**
 * @author cassandrasand
 *
 * This class describes a TV Show. There are four variables.
 * 	Name, number of seasons, number of episodes, and the genre.
 */

public class TVShow implements Comparable<TVShow>{
	
	private String name;
	private int numOfSeasons;
	private int numOfEpisodes;
	private String genre;
	
	public TVShow(String name, int numOfSeasons, int numOfEpisodes, String genre) {
		this.name = name;
		this.numOfSeasons = numOfSeasons;
		this.numOfEpisodes = numOfEpisodes;
		this.genre = genre;
	}
	
	public TVShow() {
		name = null;
		numOfSeasons = 0;
		numOfEpisodes = 0;
		genre = null;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumOfSeasons() {
		return numOfSeasons;
	}
	
	public int getNumOfEpisodes() {
		return numOfEpisodes;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumOfSeasons(int numOfSeasons) {
		this.numOfSeasons = numOfSeasons;
	}

	public void setNumOfEpisodes(int numOfEpisodes) {
		this.numOfEpisodes = numOfEpisodes;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String toString() {
		String output = "";
		output += String.format("%-18s", name);
		output += String.format("%-12d", numOfSeasons);
		output += String.format("%-12d", numOfEpisodes);
		output += String.format("%-12s", genre);
		return output;
	}
	
	public boolean equals(TVShow other) {
		if (name.equalsIgnoreCase(other.getName())) {
			return true;
		}
		else
			return false;
	}
	
	public void catchPhrase() {
		System.out.println("This is a TV Show catch phrase.");
	}
	/**
	 * @param other The other TV Show to be compared
	 * @return returns the order of a TV Show name compared to another TV Show name
	 */
	@Override
	public int compareTo(TVShow other) {
		return name.compareToIgnoreCase(other.getName());
	}

}
