package com.javaCollections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(190);
		list.add(200);
		list.add(131);
		
		list.add("david");
		list.add(true);
		list.add('A');
		
		list.add(29.45);
		list.add(new Student());
		
		for(Object value: list)
		{
			System.out.println(value);
		}
		
	}

}
