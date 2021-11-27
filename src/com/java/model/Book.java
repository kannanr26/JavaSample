package com.java.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
 private int id;
 private String name;
 private double price;
 

public static List<Book> getBooks(){
	 List<Book> books= new ArrayList<Book>(10);
	 books.add(new Book(1,"Java",100)); 
	 books.add(new Book(3,"C",100)); 
	 books.add(new Book(2,"Python",100)); 
	 books.add(new Book(5,"MYSQL",100)); 
	 books.add(new Book(4,"HIBERNATE",100)); 
	 books.add(new Book(6,"Kotlin",100)); 
	 
	return books;
	 
 }
}

