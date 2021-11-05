package com.yedam.java.ch01.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		String skill = list.get(0);
		System.out.println("0번째 : " + skill);
		System.out.println();
		
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println();
		
	}
}
