package org.tnsindia.SuperKeywordDemo;

//child class
public class Tiger extends Animal{
	public String name="Tiger"
			+ ""
			+ ""
			+ "";
	
	Tiger()
	{
		//by default it will call to parent class constructor
		//super();
		System.out.println("Child constructor");
	}
	
	public void accept()
	{
		System.out.println("Child class with "+name);
		
		//super keyword for parent class variable
		System.out.println(super.name);
		//super keyword for parent class method
		super.accept();
	}

	

}
