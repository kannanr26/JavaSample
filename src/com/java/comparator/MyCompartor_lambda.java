package com.java.comparator;

import java.util.Collections;
import java.util.List;

import com.java.model.Book;

public class MyCompartor_lambda {

	static List<Book> books=Book.getBooks();
	public static void main(String[] args) {
	Collections.sort(books ,(o1,o2)-> o2.getName().compareTo(o1.getName()));
	
	for (Book book :books) {
		System.out.println(book.getName());
	}
	}
}
