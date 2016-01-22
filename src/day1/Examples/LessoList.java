package day1.Examples;
import java.util.*;

public class LessoList {

	public static void main(String[] args) {
		List < Book > bookList = new ArrayList <Book> ();
		bookList.add(new Book("Infant ","UKeme ","Okobass ",199 ,15 ,2009  ));
		bookList.add(new Book("Faceless ","Effiong ","John Printing press",455, 20,2001));
	
for (Book t : bookList){
	t.bookAuthor = "nnnoooo";
	System.out.print (t.bookAuthor );
	System.out.print (t.bookName);
	System.out.print (t.publishers);
	System.out.print (t.pages);
	System.out.print (t.chapters);
	System.out.print (t.yearOfPublished);
}


Book book = new Book();
  book.setBookAuthor("Jude");
  book.setChapters(6);
  
  System.out.print(book.getBookAuthor()) ;

}
}