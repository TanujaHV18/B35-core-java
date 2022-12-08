package org.tnsindia.PolymorphismDemo;
//driver class
public class MethodoverloadingExecutor {

	public static void main(String[] args) {
		//Object creation
		MethodoverloadingExample m=new MethodoverloadingExample();
		//method calling
		m.addition(16, 18);
		m.addition(16, 18, 24);
		
		System.out.println();
		
		//Object creation
		Methodoverloading m1=new Methodoverloading();
		//method calling
		m1.addition(18, 16);
		m1.addition(18.6f, 66);

	}

}