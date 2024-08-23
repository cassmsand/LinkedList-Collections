/**
 * @author cassandrasand
 * This class creates a node object to be used in a linked list.
 */
public class TVShowNode {
	
	//instance variables
	private TVShow data;
	private	TVShowNode link;
	
	//contructor
	public TVShowNode(TVShow elementToAdd, TVShowNode objectBehind) {
		this.data = elementToAdd;
		this.link = objectBehind;
	}

	//Getters and Setters
	public TVShow getData() {
		return data;
	}

	public TVShowNode getLink() {
		return link;
	}

	public void setData(TVShow data) {
		this.data = data;
	}

	public void setLink(TVShowNode link) {
		this.link = link;
	}
	
	
}
