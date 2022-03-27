package com.collection;

import java.util.Iterator;
import java.util.TreeSet;



public class MainTreeset {

	public static void main(String[] args) 
	{
		TreeSet<String> tob=new TreeSet<String>();
		tob.add("Pen");
		tob.add("car");
		tob.add("Cow");
		tob.add("pencil");
		System.out.println(tob);
		System.out.println("ascending order");
        Iterator<String> iob=tob.iterator();
        while(iob.hasNext()) {
        	System.out.println(iob.next());
        }
        System.out.println("Descending order");
        Iterator<String> iob2=tob.descendingIterator();
        while(iob2.hasNext())
        {
        	System.out.println(iob2.next());
        }
	}
	

}
