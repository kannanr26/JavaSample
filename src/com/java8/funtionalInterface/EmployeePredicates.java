package com.java8.funtionalInterface;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java.model.Employee;
import com.java.modeldoa.EmployeeDAO;
 
public class EmployeePredicates 
{
    public static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }
     
    public static Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }
     
    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }
     
    public static List<Employee> filterEmployees (List<Employee> employees, 
                                                Predicate<Employee> predicate) 
    {
        return employees.stream()
                    .filter( predicate )
                    .collect(Collectors.<Employee>toList());
    }
    
    public static void main(String[] args)
    {
    	
    	Predicate <Integer> predicate =t -> t%2==0 ;
    	System.out.println( predicate.test(10));
    	
       	
    	List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    	list.stream().filter(predicate).forEach(t -> System.out.println(t));
    	
    	   
        
        List<Employee> employees = EmployeeDAO.getEmployees();
      
        System.out.println("  Male:============");        
        System.out.println( filterEmployees(employees, isAdultMale()) );
        System.out.println(" Female:============");   
        System.out.println( filterEmployees(employees, isAdultFemale()) );
         
        System.out.println( filterEmployees(employees,isAgeMoreThan(35)) );
         
        //Employees other than above collection of "isAgeMoreThan(35)" 
        //can be get using negate()
        System.out.println(filterEmployees(employees, isAgeMoreThan(35).negate()));
    }
}   