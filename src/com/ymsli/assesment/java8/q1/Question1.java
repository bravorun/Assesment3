package com.ymsli.assesment.java8.q1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Question1 {
	public static void main(String args[]) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("raj", 95);
		map.put("ekta", 75);
		map.put("rajiv", 85);
		map.put("sunita", 66);
		map.put("gunika", 99);
		System.out.println("------printing map------");
		//1. print map using stream
		System.out.println(" print map sorted by key");
		map.entrySet()
		.stream()
		.forEach(m->System.out.println(m.getKey()+":"+m.getValue()));
		//2. print only that recrods that contain key contains raj
		System.out.println("print only that recrods that contain key contains raj");
		List<Entry<String, Integer>> recordOfRaj =map.
				entrySet()
				.stream()
				.filter(m->m.getKey().contains("raj"))
				.collect(Collectors.toList());
		System.out.println(recordOfRaj);
		// 3. print map sorted by key
		System.out.println("print map sorted by key");
		map
		.entrySet()
		.stream()
		.sorted((a,b)->a.getKey().compareTo(b.getKey()))
		.forEach(m->System.out.println(m.getKey()+":"+m.getValue()));
		//4. print map sorted by values
		System.out.println("print map sorted by Values");
		map
		.entrySet()
		.stream()
		.sorted((a,b)->Integer.compare(a.getValue(),b.getValue()))
		.forEach(m->System.out.println(m.getKey()+":"+m.getValue()));
		// 5. print map sorted by key
				System.out.println("print map reverse sorted by key");
				map
				.entrySet()
				.stream()
				.sorted((a,b)->b.getKey().compareTo(a.getKey()))
				.forEach(m->System.out.println(m.getKey()+":"+m.getValue()));

	}

}
