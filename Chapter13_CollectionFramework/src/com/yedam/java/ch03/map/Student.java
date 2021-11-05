package com.yedam.java.ch03.map;

public class Student {
	public int sno;
	public String name;

	public Student(int son, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return student.name.equals(name) && (student.sno == sno);
		}
		return false;
	}
}
