package com.java.modeldoa;

import java.util.ArrayList;
import java.util.List;

import com.java.model.Book;

public class BookDAO {

	  public static List<Book> getAllBook() {
		  List<Book>  books= new ArrayList<Book>(100);
		  for(int i =1 ;i<=100; i++) {
			  books.add(new Book(i, "Book "+i, 100));
		  }
		  return books;
	  }
		
	
}
