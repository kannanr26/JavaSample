package com.java8.funtionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.java.model.Employee;
import com.java.modeldoa.EmployeeDAO;

public class MyStream_Filter_ForEach {

	  static List<Employee> employees = new ArrayList<Employee>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStream_Filter_ForEach filter =new MyStream_Filter_ForEach();

        employees = EmployeeDAO.getEmployees();
	     
        System.out.println(":: Taxed Emp::");
		System.out.println(filter.getTaxedEmployee());
		
		System.out.println(":: Non Taxed Emp::");
		System.out.println(filter.getEmployeeByTax(false));

		System.out.println(":: Taxed Emp::");
		filter.getEmployeeByTax(true).stream().forEach(t->System.out.println( t));
		System.out.println(":: Male Emp::");
		
		filter.getEmployeeByGender("M").stream().forEach(t->System.out.println( t));
		System.out.println(":: Female Emp::");
	//	filter.getEmployeeByGender("F").stream().forEach(t->System.out.println( t));
		//
		
		Map<Integer,Employee> emp_Map=EmployeeDAO.convertListoMap(filter.getEmployeeByGender("F"));
		emp_Map.forEach((key, value) -> System.out.println( "key:"+key +" Emp:"+value) );
		
		System.out.println(":::: Using Entry set:::::");
		emp_Map.entrySet().stream().forEach(obj -> System.out.println(obj));
	}
	
	
	
	private  List<Employee> getTaxedEmployee(){
		
		return employees.stream().filter(emp -> emp.getSalary()>500000).collect(Collectors.toList());
		
	}
	
	
private  List<Employee> getEmployeeByTax(boolean isTax){
		
		
		return (isTax)?employees.stream().filter(emp -> emp.getSalary()>500000).collect(Collectors.toList())
				: employees.stream().filter(emp -> emp.getSalary()<=500000).collect(Collectors.toList());
		
	}

private  List<Employee> getEmployeeByGender(String gender){
	return (gender.equalsIgnoreCase("m"))?employees.stream().filter(emp -> emp.getGender().equalsIgnoreCase("M")).collect(Collectors.toList())
			: employees.stream().filter(emp -> emp.getGender().equalsIgnoreCase("F")).collect(Collectors.toList());
	
}
	

}
