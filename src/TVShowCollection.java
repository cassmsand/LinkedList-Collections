/**
 * @author cassandrasand
 * 
 * This class decribes a collection of TV Shows. For example, Netflix has a collection
 * 	of TV shows.
 */

import java.util.Iterator;

public class TVShowCollection implements Iterable<TVShow>{
	
	private TVShow[] collection; //TV show array collection
	private int numShows; //how many TV Shows are in the collection
	
	public TVShowCollection(int max) {
		collection = new TVShow[max];
	}
	
	/**
	 * @param addShow TV Show to be added into the collection
	 * @return returns true if the TV show is able to be added into the collection,
	 * 	may return false if there is no more room left in the collection array
	 */
	public boolean insert(TVShow addShow) {
		if (numShows < collection.length) {
			int i;
			//if a TVShow name if less than the addShow, addShow is added after
			for(i = numShows - 1; i >= 0 && collection[i].compareTo(addShow) < 0; i--) {
				collection[i + 1] = collection[i];
			}
			collection[i+1] = addShow;
			numShows++;
			
			return true;
		}
		else
			return false;
	}
	/**
	 * @param removeShow TV show to be removed
	 */
	public void delete(TVShow removeShow) {
		for (int i = 0; i < collection.length && !(collection[i] == null); i++) {
			if (collection[i].equals(removeShow)) {
				for (int j = i; j < collection.length - 1; j++) {
					collection[j] = collection[j + 1];
					collection[j+1] = null;
				}
				numShows--;
			}
		}
	}
	
	public int size() {
		return numShows;
	}
	/**
	 * @return returns true if the collection is has no TV Shows assigned to it
	 */
	public boolean isEmpty() {
		if (collection[0] == null) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * @param show TV show to find the index of in the collection array
	 * @return the index of the TV Show in the collections array
	 */
	public int indexOf(TVShow show) {
		for (int i = 0; i < collection.length && !(collection[i] == null); i++) {
			if (collection[i].equals(show)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * @param TVShows TV Show collection to find the last index of
	 * @return the index of the last entered slot in the array
	 */
	public int lastIndexOf(TVShowCollection TVShows) {
		for (int i = 0; i <collection.length; i++) {
			if (collection[i] == null) {
				return i - 1;
			}
		}
		return -1;
	}
	
	/**
	 * @param index an index in the collection array
	 * @return the TV Show item in that index of the array
	 */
	public TVShow grab(int index) {
		if (index < collection.length)
			return collection[index];
		else
			return null;
	}
	
	/**
	 * @param show TV show to be found
	 * @return true if the TV show object is found in the collection
	 */
	public boolean contains(TVShow show) {
		String name = show.getName();
		for (int i = 0; i < collection.length && !(collection[i] == null); i ++) {
			if (name.equalsIgnoreCase(collection[i].getName()))
				return true;
		}
		return false;
	}
	
	/**
	 * @param show TV show to be counted
	 * @return the number of times the TV show object was found in the array collection
	 */
	public int countOccurrences(TVShow show) {
		int count = 0;
		for (int i = 0; i < collection.length && !(collection[i] == null); i++) {
			if (show.equals(collection[i]))
				count++;
		}
		return count;
			
	}

	@Override
	public String toString() {
		String output = "";
		output += String.format("%-18s%-12s%-12s%-12s", "Name", "Seasons", "Episodes", "Genre");
		output += "\n-----------------------------------------------------------\n";
		for (int i = 0 ; i < collection.length ; i++)
			output += collection[i] + "\n";
		
		return output;
	}
	//Iterator method
	@Override
	public Iterator<TVShow> iterator() {
		return new TVShowIterator();
	}
	
	//Iterator class
	private class TVShowIterator implements Iterator<TVShow> {
		private int cursor = numShows;

		@Override
		public boolean hasNext() {
			return cursor >= 0;
		}

		@Override
		public TVShow next() {
			return collection[cursor--];
			
		}		
	}

	
}
