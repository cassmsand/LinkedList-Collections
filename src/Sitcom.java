/**
 * @author cassandrasand
 *
 * This class describes a Sitcom. It has five variables.
 * 	Name, number of seasons, number of episodes, genre, and if it uses a laugh track
 * 	or not.
 */
public class Sitcom extends TVShow {
	private boolean usesLaughTrack = false;
	
	public Sitcom(String name, int numOfSeasons, int numOfEpisodes, 
				String genre, boolean usesLaughTrack) {
		super(name, numOfSeasons, numOfEpisodes, genre);
		this.usesLaughTrack = usesLaughTrack;
	}
	
	public boolean getUsesLaughTrack() {
		return usesLaughTrack;
	}
	
	public void setUsesLaughTrack(boolean usesLaughTrack) {
		this.usesLaughTrack = usesLaughTrack;
	}
	
	public String toString() {
		String output = "";
		output += super.toString();
		output += usesLaughTrack + "\t\t";
		return output;
	}
	
	//Overrides the catchPhrase method in the TVShow parent class
	@Override
	public void catchPhrase() {
		System.out.println("How you doing?");
	}
}
