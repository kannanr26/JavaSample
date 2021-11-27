package com.java.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.model.Book;

public class MyCompartor_Normal implements Comparator<Book> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books=Book.getBooks();
		
		Collections.sort(books ,new MyCompartor_Normal());
		
		for (Book book :books) {
			System.out.println(book.getName());
		}
		List<Book> books_re=fetchBook(books);
		
		for (Book book :books_re) {
			System.out.println(book.getName());
		}
		
		
		
		
		
		
	}

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
	
	public static List<Book>  fetchBook(List<Book> books) {
		Collections.sort( books ,new Comparator<Book>(){
			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}

		});
		return books;
		
	}
	

}
