package com.ymsli.assesment.java8.q2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]) {
		Map<Student, Integer> map=new HashMap<>();
		map.put(new Student(9, "raj", 95), 95);
		map.put(new Student(61, "keta", 78), 78);
		map.put(new Student(11, "gunika", 98), 98);
		map.put(new Student(19, "keshav", 97), 97);
		System.out.println("All Records as per name of the student");
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
		.forEach(e-> System.out.println(e));
		System.out.println("All records as per id ");
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getId)))
		.forEach(e-> System.out.println(e));
	}
	
}
