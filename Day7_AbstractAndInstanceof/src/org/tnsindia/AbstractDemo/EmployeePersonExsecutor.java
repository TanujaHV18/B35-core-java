package org.tnsindia.AbstractDemo;

public class EmployeePersonExsecutor {

	public static void main(String[] args) {
		Person p1=new Employee("Rajesh","Male",23);
		Person p2=new Employee("Monika","Female",0);
		
		//to return the data that we inserted
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.work();
		p2.work();


	}
		
	}

