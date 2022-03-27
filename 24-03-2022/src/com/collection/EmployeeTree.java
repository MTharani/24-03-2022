package com.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class Employee
{
	int e_id;
	String e_name;
	float e_sal;
	String e_dep;
	
public Employee(int e_id, String e_name, float e_sal, String e_dep) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_sal = e_sal;
		this.e_dep = e_dep;
	}
}
class EmployeeSort implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.e_name.compareTo(o2.e_name);
	}
	
}
class EmployeeId implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.e_id-o2.e_id;
	}
	
}
public class EmployeeTree {

	public static void main(String[] args) 
	{
		TreeSet<Employee> teo=new TreeSet<Employee>(new EmployeeSort());
		Employee e1=new Employee(124,"Thara",8976.5f,"tcs");
		Employee e2=new Employee(125,"Divi",3246.5f,"tcs");
		Employee e3=new Employee(121,"Devaki",9976.5f,"tcs");
		Employee e4=new Employee(123,"Seetha",3276.5f,"tcs");
		teo.add(e1);
		teo.add(e2);
		teo.add(e3);
		teo.add(e4);
		Iterator<Employee> ie=teo.iterator();
		while(ie.hasNext())
		{
			Employee eob=ie.next();
			System.out.println(eob.e_id+ " "+eob.e_name+ " "+eob.e_sal+" "+eob.e_dep);
		}

		//Id sorting
		System.out.println("Id sorthing");
		TreeSet<Employee> teo1=new TreeSet<Employee>(new EmployeeId());
		teo1.add(e1);
		teo1.add(e2);
		teo1.add(e3);
		teo1.add(e4);
		Iterator<Employee> ie1=teo1.iterator();
		while(ie1.hasNext())
		{
			Employee eob1=ie1.next();
			System.out.println(eob1.e_id+ " "+eob1.e_name+ " "+eob1.e_sal+" "+eob1.e_dep);
		}

	}

}
