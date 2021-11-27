package com.java8.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnionAndIntersect {
public static void main (String[] args) {
		
		List<String> list1 = new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
		List<String> list2 = new ArrayList<String>(Arrays.asList("b","d","f","g"));
		
	List<String> list3=	getUnion(list1,list2);
System.out.println(list3);
	List<String> list4= getIntersect(list1,list2);
	System.out.println(list4);	
}

private static List<String> getUnion (List<String> list1, List<String> list2) {
	// TODO Auto-generated method stub
	Set<String> set = new HashSet<>();
	set.addAll(list1);

	set.addAll(list2);
	
	return new ArrayList<>(set);
}

private static List<String> getIntersect(List<String> list1, List<String> list2) {
	// TODO Auto-generated method stub
	List<String> list4= list2.stream()
			.filter(list2::contains).collect(Collectors.toList());
	return list4;
}

}
