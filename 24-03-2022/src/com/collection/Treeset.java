package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) 
	{
		TreeSet<Float> tob=new TreeSet<Float>();
		tob.add(456.2f);
		tob.add(638.2f);
		tob.add(452.5f);
		System.out.println(tob);
		System.out.println("ascending order");
        Iterator<Float> iob=tob.iterator();
        while(iob.hasNext()) {
        	System.out.println(iob.next());
        }
        System.out.println("Descending order");
        Iterator<Float> iob2=tob.descendingIterator();
        while(iob2.hasNext())
        {
        	System.out.println(iob2.next());
        }

	}

}
