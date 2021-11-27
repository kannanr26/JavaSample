package com.java8.parallelstream;

import java.util.List;
import java.util.stream.IntStream;

import com.java.model.Book;
import com.java.modeldoa.BookDAO;

public class ParallelSream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start=System.currentTimeMillis();
		IntStream.range(0, 100).forEach(System.out::print);
	
		System.out.println(" End :"+(System.currentTimeMillis()-start));
	
		 start=System.currentTimeMillis();
		IntStream.range(0, 100).parallel().forEach(System.out::print);
		System.out.println("End :"+(System.currentTimeMillis()-start));
		

		IntStream.range(0, 5).forEach(x -> System.out.println(" Thread : "+Thread.currentThread().getName()));
		IntStream.range(0, 5).parallel().forEach(x -> System.out.println("Parallel Thread : "+Thread.currentThread().getName()));
		
		List<Book> books=BookDAO.getAllBook();
		
		start=System.currentTimeMillis();
		double bookSteamAvg=books.stream()
				.map(book-> book.getPrice()).mapToDouble(i -> i ).average().getAsDouble();
				System.out.println(" stream Book Avg Price  "+bookSteamAvg+ " and Time"+ (System.currentTimeMillis()-start));
		
				
		start=System.currentTimeMillis();
		double bookAvg=books.parallelStream()
		.map(book-> book.getPrice()).mapToDouble(i -> i ).average().getAsDouble();
		System.out.println(" Parallel Book Avg Price  "+bookAvg+ " and Time"+ (System.currentTimeMillis()-start));
		
	
		start=System.currentTimeMillis();
		double bookSteamAvg1=books.stream()
				.map(book-> book.getPrice()).mapToDouble(i -> i ).average().getAsDouble();
				System.out.println(" stream Book Avg Price  "+bookSteamAvg+ " and Time"+ (System.currentTimeMillis()-start));
		
	}
	
	

}
