package com.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.java.model.Employee;
import com.java.modeldoa.EmployeeDAO;

public class MyOptional {

	public static Employee getEmployeeByEmailId(String email) throws Exception {
		List<Employee> employees = EmployeeDAO.getEmployees();
		return employees.stream().filter(employee -> employee.getEMailId().equals(email)).findAny()
				.orElseThrow(() -> new Exception("no employee present with this email id"));

	}

	public static void main(String[] args) throws Exception {
		Employee e7 = new Employee(7, 68, "F", "Melissa", 300000, Arrays.asList(349201, 128395), null);
		Employee e8 = new Employee(7, 68, "F", "Melissa", 300000, Arrays.asList(349201, 128395), "y@mail.com");

		// empty
		// of
		// ofNullable

		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);

		//Optional<String> emailOptional = Optional.of(e7.getEMailId());
		//System.out.println(emailOptional);

		Optional<String> emailOptional2 = Optional.ofNullable(e7.getEMailId());
		if (emailOptional2.isPresent()) {
			System.out.println(emailOptional2.get());
		} else {
			System.out.println("Email is isPresent False");
		}
		Optional<String> email = Optional.ofNullable(e8.getEMailId());
		if (email.isPresent()) {
			System.out.println(email.get());

			System.out.println(emailOptional2.orElse("default@email.com"));

			try {
				System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("email not present")));

			} catch (IllegalArgumentException e) {
				System.out.println(" email Optional  IllegalArgumentException");
			}

			System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(() -> "default email..."));

			getEmployeeByEmailId("pqr");
		}

	}
}
