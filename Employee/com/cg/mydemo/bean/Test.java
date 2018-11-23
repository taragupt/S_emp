package com.cg.mydemo.bean;

import java.util.*;

public class Test {

	
	
	public static void main(String[] args) {
		
		/*Employee e=new Employee(1,"Varsha");
		Employee e1=new Employee();
		Employee e2= new Employee(2,"Bhushan");*/
		
	Map myEmpList=new LinkedHashMap<Integer,Employee>();
		
	    myEmpList.put(101,new Employee(1,"Varsha"));
		myEmpList.put(102,new Employee());
		myEmpList.put(103,new Employee(2,"Bhushan"));
		
		/*Iterator i=myEmpList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}*/
		
		
		
		/*for(Employee emp:myEmpList)
		{
			System.out.println(emp);
			
		}*/
			
			
		
		Set s=myEmpList.keySet();		
		
		for(Object m:s)
		{
			if(m instanceof Integer)
			{
			System.out.println((Employee)myEmpList.get(m));
			}
			else
			{
			  System.out.println("Error");
			}
			
		}
	  
	
	}

}
