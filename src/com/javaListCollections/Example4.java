package com.javaListCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//List: ArrayList
public class Example4 {

	public static void main(String[] args) 
	{
		
		//ArrayList list1 = new ArrayList();
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(120);
		list2.add(122);
		list2.add(189);
		list2.add(390);
		
		list2.add(2, 500);
		
		System.out.println(list2);

		System.out.println("-----------------------------");
		
		Collections.sort(list2);
		
		System.out.println(list2);
		
		
	}

}
