package com.java.hashmap;

import java.util.HashMap;

public class SampleHashmap {

	public SampleHashmap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> hash=new HashMap<String,Integer>();
		hash.put("key", 1);
		hash.put("Key", 1);
		System.out.println(hash.size());
	}

}
