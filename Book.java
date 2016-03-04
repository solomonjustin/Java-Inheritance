package HOT;

public class Book {
	
	//fields
	private String _name;
	private String _publishDate;
	private String _author;
	
	//constructors
	public Book(String _name, String _publishDate, String _author) {
		this._name = _name;
		this._publishDate = _publishDate;
		this._author = _author;
	}
	
	public Book(Book obj){
		this(obj._name, obj._publishDate, obj._author);
	}
	
	
	public String get_name() {
		return _name;
	}

	public String get_publishDate() {
		return _publishDate;
	}

	public String get_author() {
		return _author;
	}
	
	public String toString() {
		return "	Title: " + _name + "\n	Publish Date: " + _publishDate + "\n	Author: " + _author;
	}
	
}
