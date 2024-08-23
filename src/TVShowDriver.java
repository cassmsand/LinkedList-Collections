import java.util.Iterator;

public class TVShowDriver {

	public static void main(String[] args) {
		
		//Create TVShow object
		TVShow bridgerton = new TVShow("Bridgerton", 2, 16, "Historical Drama");	
		TVShow loveIsBlind = new TVShow("Love is Blind", 4, 56, "Realty TV Romance");
		
		//Create Sitcom object - child of TVShow parent
		Sitcom friends = new Sitcom("Friends", 10, 236, "Sitcom", true);
		
		TVShow perfectMatch = new TVShow("Perfect Match", 1, 12, "Realty TV Romance");
		TVShow theUltimatum = new TVShow("The Ultimatum", 1, 10, "Realty TV Romance");
		TVShow neverHaveIEver = new TVShow("Never Have I Ever", 4, 40, "Drama");
		TVShow janeTheVirgin = new TVShow("Jane the Virgin", 5, 100, "Telenovela");
		
		//Test TVShow Collection Linked List
		TVShowCollectionLinked netflix1 = new TVShowCollectionLinked();
		
		//test insert linked list
		netflix1.insert(bridgerton);
		netflix1.insert(loveIsBlind);
		netflix1.insert(perfectMatch);
		netflix1.insert(theUltimatum);
		netflix1.insert(neverHaveIEver);
		netflix1.insert(janeTheVirgin);

		//test delete linked list
		netflix1.delete(neverHaveIEver);
		
		System.out.println(); //space
		
		//test toString linked list method
		System.out.println(netflix1.toString());
		
		//Test size linked list method
		System.out.println("Size: " + netflix1.size());
		
		//Test isEmpty linked list method
		System.out.println("is empty: " + netflix1.isEmpty());
		
		//Test indexOf Linked list method
		System.out.println("Index of Bridgerton: " + netflix1.indexOf(bridgerton));
		
		//Test lastIndexOf Linked List method
		System.out.println("Last index of Love is Blind: " + netflix1.lastIndexOf(loveIsBlind));
		
		//Test grab Linked list method
		System.out.println("Grab TV Show at position 2: " + netflix1.grab(2));
		
		//Test contains linked list method
		System.out.println("Does the list contain friends?: " + netflix1.contains(friends));
		
		//Test countOccurrences linked list method
		System.out.println("# of times Bridgerton is in list: " + netflix1.countOccurrences(bridgerton));
		
		/*
		//Test Collection methods
		
		//Create TVShowCollection object
		TVShowCollection netflix = new TVShowCollection(5);
		
		//Test insert method
		netflix.insert(bridgerton);
		netflix.insert(loveIsBlind);
		netflix.insert(perfectMatch);
		netflix.insert(theUltimatum);
		netflix.insert(neverHaveIEver);
		
		//Test toString method
		System.out.println(netflix);
		
		//Test delete method
		netflix.delete(neverHaveIEver);
		System.out.println(netflix);
		
		//Test size method
		System.out.println("# of TVShows: " + netflix.size());
		
		//Test isEmpty method
		System.out.println("Is TV Show Collection empty: " + netflix.isEmpty());
		
		//Test indexOf method
		System.out.println("Bridgerton is at index: " + netflix.indexOf(bridgerton));
		
		//Test lastIndexOf methof
		System.out.println("Index of last TV Show in collection: " + netflix.lastIndexOf(netflix));
		
		//Test grab method
		System.out.println("What is at index 2: " + netflix.grab(2));
		
		//Test contains method
		System.out.println("Does Netflix contain Friends: " + netflix.contains(friends));
		
		//Test count occurrences method
		System.out.println("How many times in Bridgerton entered: " + netflix.countOccurrences(bridgerton));
		
		System.out.println("");
		
		//Test Iterator
		Iterator<TVShow> it = netflix.iterator();
		
		while(it.hasNext()) {
	         Object element = it.next();
	         System.out.print(element + "\n");
	     }

		//Test getters
		System.out.println(bridgerton.getName());
		System.out.println(bridgerton.getNumOfSeasons());
		System.out.println(bridgerton.getNumOfEpisodes());
		System.out.println(bridgerton.getGenre());
		
		System.out.println(); //Space
		
		//Test toString method
		System.out.println("ToString:");
		System.out.println(bridgerton.toString());
		
		System.out.println(); //Space
		
		//Test equals method
		System.out.print("Does Bridgerton equal Love is Blind?:");
		System.out.println(bridgerton.equals(loveIsBlind));
		
		System.out.println(); //Space
		
		//Create Sitcom object - child of TVShow parent
		Sitcom friends = new Sitcom("Friends", 10, 236, "Sitcom", true);
		
		//test getter in Sitcom class
		System.out.println("Does Friends uses a laugh track: " + friends.getUsesLaughTrack());
		
		System.out.println(); //Space
		
		//Test toString in Sitcom class
		System.out.println(friends.toString());
		
		System.out.println(); //Space
		
		//Test catchPhrase in TV show and Sitcom class
		bridgerton.catchPhrase(); //parent class method
		friends.catchPhrase(); //child class method
		*/
		
		
		
	}

}
