package com.java8.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.comparator.MyEmployeeCompartor;
import com.java.model.Employee;
import com.java.modeldoa.EmployeeDAO;

public class MySortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =Arrays.asList(1,10,3,2,5,4,7,6,9,8);
		System.out.println( ":: Ascending");
		Collections.sort(list);
		System.out.println(list);
		System.out.println( ":: Descending");
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println( ":: Ascending using lambda");
		
		list.stream().sorted().forEach(t-> System.out.println(t));
		
			System.out.println( ":: descending using lambda");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.println(t));
		
		
		
		List<Employee> employees=EmployeeDAO.getEmployees();
		
		Collections.sort(employees,new MyEmployeeCompartor() );

		System.out.println( ":: Employee using Compartor Class: with Age");
		employees.forEach(t->System.out.println(t));


		Collections.sort(employees,new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o2.getSalary()-o1.getSalary();
			}
		});

		System.out.println( ":: Employee using Functional: with Salary");
		employees.forEach(t->System.out.println(t));

		
		System.out.println( ":: Employee using lambda: with Id");
		Collections.sort(employees,(o1,o2) -> o1.getId()-o2.getId());
		employees.stream().forEach(t->System.out.println(t));
		//employees.stream().sorted(Comparator<Employee> 
		
		
		System.out.println( ":: Employee using Stream: with Salary");
		employees.stream().sorted((o1,o2) -> o1.getSalary()-o2.getSalary()).forEach(t->System.out.println(t));
		
		System.out.println( ":: Employee using Stream comparing : with Name");
		employees.stream().sorted(Comparator.comparing(emp-> emp.getFirstName() )).forEach(System.out::println);
		
		
		System.out.println( ":: Employee using Stream method refference : with Name");
		employees.stream().sorted(Comparator.comparing(Employee::getFirstName )).forEach(System.out::println);
		
		
	}

}
