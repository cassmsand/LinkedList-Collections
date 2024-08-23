import java.util.Iterator;

/**
 * @author cassandrasand
 * This class creates a linked list of TVShow items.
 */
public class TVShowCollectionLinked implements Iterable<TVShow>{

	//instance variable
	private TVShowNode head;
	
	//No-args constructor
	public TVShowCollectionLinked() {
		head = null;
	}
	
	//insert method - insert TVShow into the list
	public void insert(TVShow showToAdd) {
		if (head == null) { //list is empty
			head = new TVShowNode(showToAdd, null);
		}
		else if (showToAdd.compareTo(head.getData()) > 0) { //TVshow should be placed at the beginning
			head = new TVShowNode(showToAdd, head);
		}
		else {//TVShow insert middle
			TVShowNode cursor = head;
			while (cursor.getLink() != null && cursor.getLink().getData().compareTo(showToAdd) > 0) {
				cursor = cursor.getLink();
			}
			TVShowNode previous = cursor;
			previous.setLink(new TVShowNode (showToAdd, previous.getLink()));
		}
	}
	
	//delete method - delete TVshow from list
	public void delete(TVShow showToRemove) {
		TVShowNode cursor = head;
		while (cursor.getLink().getData() != showToRemove) {
			cursor = cursor.getLink();
		}
		TVShowNode previous = cursor;
		previous.setLink(previous.getLink().getLink());
	}
	
	//size method - returns the size of the linked list
	public int size() {
		int numShows = 0;
		
		TVShowNode cursor = head;
		while (cursor != null) {
			numShows ++;
			cursor = cursor.getLink();
		}
		
		return numShows;
	}
	
	//isEmpty method - returns true if the list is empty
	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}
	
	//indexOf method - returns the index of the TVShow entered, -1 if not found
	public int indexOf(TVShow show) {
		int index = 1;
		
		TVShowNode cursor = head;
		while (cursor.getData() != show) {
			index ++;
			cursor = cursor.getLink();
		}
		if (cursor.getData() != show && cursor.getLink() == null) //end of list, not the end element and no element found
			return -1;
		else
			return index;
	}
	
	//lastIndexOf method - returns the index of the last instance of TVShow
	public int lastIndexOf(TVShow show) {
		int index = 1;
		int indexFound = -1;
		
		TVShowNode cursor = head;
		while (cursor != null) {
			if (cursor.getData() == show)
				indexFound = index;
			index ++;
			cursor = cursor.getLink();
		}
		return indexFound;
	}
	
	//grab method - returns the TVShow at the specified position in list or null if not valid
	public TVShow grab(int position) {
		int count = 1;
		TVShowNode cursor = head;
		while (cursor != null) {
			count++;
			cursor = cursor.getLink();
		}
		if (position < 1 || position > count)
			return null;
		else {
			int index = 1;
			cursor = head;
			while (index < position) {
				index ++;
				cursor = cursor.getLink();
			}
			return cursor.getData();
		}
	}
	
	//contains method - returns true if TV Show is found in list at least once
	public boolean contains(TVShow show) {
		boolean result = false;
		
		TVShowNode cursor = head;
		while (cursor != null) {
			if (cursor.getData().equals(show)) {
				result = true;
			}
			cursor = cursor.getLink();
		}
		return result;
	}
	
	//countOccurrences method - returns the # of times a TV Show is in the list
	public int countOccurrences(TVShow show) {
		int result = 0;
		
		TVShowNode cursor = head;
		while (cursor != null) {
			if (cursor.getData() == show)
				result ++;
			cursor = cursor.getLink();
		}
		
		return result;
	}
	
	//toString
	public String toString() {
		String output = "";
		output += String.format("%-18s%-12s%-12s%-12s", "Name", "Seasons", "Episodes", "Genre");
		output += "\n***********************************************************\n";
		
		TVShowNode cursor = head;
		while (cursor != null) {
			output += cursor.getData() + "\n";
			cursor = cursor.getLink();
		}
		
		return output;
	
	}

	@Override
	public Iterator<TVShow> iterator() {
		return new TVShowIterator();
	}
		
		private class TVShowIterator implements Iterator<TVShow> {
			private TVShowNode head;
			
			public TVShowIterator() {
				head = null;
			}
			
			@Override
			public boolean hasNext() {
				TVShowNode cursor = head;
				if (cursor.getLink() == null)
					return false;
				else
					return true;
			}

			@Override
			public TVShow next() {
				TVShowNode cursor = head;
				TVShow result = cursor.getLink().getData();
				cursor = cursor.getLink();
				return result;
			}
		}
}
