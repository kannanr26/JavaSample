package com.java.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	 private Integer id;
	   private Integer age;
	   private String gender;
	   private String firstName;
	   private Integer salary;
	   private List<Integer> mobiles;
	   private String eMailId;
}

