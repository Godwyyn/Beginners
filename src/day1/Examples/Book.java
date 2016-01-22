package day1.Examples;

public class Book {

	private String bookName, bookAuthor, publishers;
	 private int pages,chapters,yearOfPublished;
	
	
	
	
	public Book(String bookName,String bookAuthur,String publishers,int pages ,int chapters, int yearOfPublished){
		this.bookName = bookName;
		this.bookAuthor = bookAuthur;
		this.publishers = publishers;
		this.pages = pages;
		this.chapters = chapters;
		this.yearOfPublished = yearOfPublished;
	}
	
	public Book(){
		
	}
	
	public Book(String n){
		 this.bookName  = n ;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getPublishers() {
		return publishers;
	}
	public void setPublishers(String publishers) {
		this.publishers = publishers;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getChapters() {
		return chapters;
	}
	public void setChapters(int chapters) {
		this.chapters = chapters;
	}
	public int getYearOfPublished() {
		return yearOfPublished;
	}
	public void setYearOfPublished(int yearOfPublished) {
		this.yearOfPublished = yearOfPublished;
	}
	
	
	
		

	

}
