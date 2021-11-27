package com.java.modeldoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.java.model.Employee;
import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

public class EmployeeDAO {

	
	  static List<Employee> employees = new ArrayList<Employee>();
	  public static  List<Employee>   getEmployees() {
			// TODO Auto-generated method stubfalse

			 Employee e1 = new Employee(1,23,"M","Rick",500000,Arrays.asList(12171821,1290123),"y@ymail.com");
		      //  Employee e2 = new Employee(2,13,"F","Martina","Hengis");
		        Employee e3 = new Employee(3,43,"M","Ricky",600000,Arrays.asList(32111821,2321),"g@gmail.com");
		        //Employee e4 = new Employee(4,26,"M","Jon","Lowman");
		        Employee e5 = new Employee(5,19,"F","Cristine",1100000,Arrays.asList(1293202),"yg@mail.com");
		        //Employee e6 = new Employee(6,15,"M","David","Feezor");
		        Employee e7 = new Employee(7,68,"F","Melissa",300000,Arrays.asList(349201,128395),"Gy@gmail.com");
		        //Employee e8 = new Employee(8,79,"M","Alex","Gussin");
		        //Employee e9 = new Employee(9,15,"F","Neetu","Singh");
		        Employee e10 = new Employee(10,45,"M","Naveen",500000,Arrays.asList(344343,32323),"g@ymail.com");
		       
		        employees.addAll(Arrays.asList(new Employee[]{e1,e3,e5,e7,e10}));
		        return employees;
		      
		}
	  public static Map<Integer, Employee> convertListoMap(List< Employee>  employees) {
		    Map<Integer,  Employee> map = employees.stream()
		      .collect(Collectors.toMap(Employee::getId, Function.identity() ));
		    return map;
		}
	  
	
		
}
