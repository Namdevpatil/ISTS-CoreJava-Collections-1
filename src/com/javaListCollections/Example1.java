package com.javaListCollections;

import java.util.ArrayList;
import java.util.List;

//List: ArrayList
public class Example1 {

	public static void main(String[] args) 
	{
		
		//ArrayList list1 = new ArrayList();
		List list2 = new ArrayList();
		
		list2.add(120);
		list2.add(122);
		list2.add(189);
		list2.add(390);
		
		list2.add(2, 500);
		
		System.out.println(list2);

		System.out.println("-----------------------------");
		
		List list3 = new ArrayList();
		
		list3.add("Hello");
		list3.add(null);
		list3.add("Hello");
		
		//list3.addAll(0, list2);
		list3.addAll(list2);
		
		System.out.println(list3);
		
		
	}

}
