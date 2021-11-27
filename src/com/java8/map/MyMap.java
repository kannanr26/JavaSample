package com.java8.map;

import java.util.List;
import java.util.stream.Collectors;

import com.java.model.Employee;
import com.java.modeldoa.EmployeeDAO;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees=EmployeeDAO.getEmployees();
		
		//one to one
		List<String>  names=employees.stream().map(emp->emp.getFirstName()).collect(Collectors.toList());
		System.out.println(" names"+names);
		
		List<List<Integer>>  mobiles=employees.stream().map(emp->emp.getMobiles()).collect(Collectors.toList());
		System.out.println(" mobiles"+mobiles);
		 
		//many to one
       List<Integer>  flat_mobiles=employees.stream().flatMap(emp->emp.getMobiles().stream()).collect(Collectors.toList());
		System.out.println("Flat mobiles"+flat_mobiles);
	}

}
