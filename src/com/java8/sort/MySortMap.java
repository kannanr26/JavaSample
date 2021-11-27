package com.java8.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.java.model.Employee;
import com.java.modeldoa.EmployeeDAO;

public class MySortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String , Integer> myMap= new HashMap<>();
		myMap.put("K", 1);
		myMap.put("R", 4);
		myMap.put("p", 3);
		myMap.put("D", 5);
		myMap.put("S", 6);
		
		List<Entry<String,Integer>> entries = new ArrayList<>(myMap.entrySet());
		//Collections.sort(entries);
		Collections.sort(entries,new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
			
		});
		System.out.println("Using Compatator method:::");	
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey());
		}
		
		
		Collections.sort(entries,(o1,o2) -> o1.getValue().compareTo(o2.getValue()));
			
		System.out.println("Using lambda method:::");	
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey());
		}
		System.out.println("Using Stream method:::");	
		myMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("Using Stream method:::");	
		myMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
		Map<Integer,Employee> emp_Map=EmployeeDAO.convertListoMap(EmployeeDAO.getEmployees());
		
		Map<Employee,Integer> emp_MapSort = new TreeMap<>(new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) o1.getSalary() -o2.getSalary();
			}
			
		});
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey());
		}
	
		System.out.println("Using lambda method:::");	
		Map<Employee,Integer> emp_MapSortAge = new TreeMap<>( (o1,o2)-> (int) o2.getAge()-o1.getAge());
		emp_MapSortAge.entrySet().stream().forEach(t->System.out.println(t.getKey()));
		
		
		
		System.out.println("Using Stream method Key:::");	
		emp_Map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("Using Stream method Value Salary:::");	
		emp_Map.entrySet().stream().sorted(Map.Entry.comparingByValue( Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
		
		System.out.println("Using Stream method Value Name:::");	
		emp_Map.entrySet().stream().sorted(Map.Entry.comparingByValue( Comparator.comparing(Employee::getFirstName).reversed())).forEach(System.out::println);
		
	}

}
