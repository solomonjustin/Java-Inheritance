package HOT;

public class Library {
	
	//fields
	private String _name;
	private Book book;
	
	//constructors
	public Library(String _name, Book book) {
		this._name = _name;
		this.book = new Book(book);
	}

	public String toString() {
		return "Library: " + _name + "\n\nBooks in Library:\n" + book + "\n";
	}
	
	

}
