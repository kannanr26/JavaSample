package com.java8.map;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import com.java.model.Employee;
import com.java.modeldoa.EmployeeDAO;

public class MyMapReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers= Arrays.asList(3,1,9,2,4,0,8,7,4,6,5);
		int sum=0;
		for(int value: numbers)
			sum+=value;
		System.out.println(" sum"+sum);
		
		//Reduce method
		int sumreduce = numbers.stream().reduce(0,(a,b)->(a+b));
		System.out.println("Sum using reduce:"+sumreduce);
		
		// return optional 
		int sumreduce2 = numbers.stream().reduce((a,b)->(a+b)).get();
		System.out.println("Sum using reduce:"+sumreduce2);
		
		//using Method refference
		int sumreduce3 = numbers.stream().reduce(Integer::sum).get();
		System.out.println("Sum using reduce:"+sumreduce3);
		
		//Stream API
		int sumMap= numbers.stream().mapToInt(i -> i).sum();
		System.out.println("sumMap:"+sumMap);
		
		//Bigger
		int bigger= numbers.stream().reduce((a,b)-> a>b ? a :b).get();
		System.out.println("bigger:"+bigger);
		//using ref method
		int minValue= numbers.stream().reduce(Integer::min).get();
		System.out.println("minValue:"+minValue);
		
		List<String> words=Arrays.asList("Java","Spring","Hibernate");
		String wordlenght=words.stream().reduce((word,word2) -> (word.length()>word2.length() )?word :word2).get().toString();
		System.out.println("String word:"+wordlenght);
		List<Employee> employees=EmployeeDAO.getEmployees();
		
		double salary_avg = employees.stream().filter(emp -> emp.getSalary()>500000)
		.map(Employee::getSalary)
		.mapToInt(i -> i).average().getAsDouble();
		System.out.println("Avg Salary:"+salary_avg);
		
		double sumSalary = employees.stream()
				.map(Employee::getSalary)
				.mapToInt(i -> i).sum();
				System.out.println("Total Salary:"+sumSalary);
				
	}

}
