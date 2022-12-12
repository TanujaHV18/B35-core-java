package org.tnsindia.customexceptiondemo;


import java.util.Scanner;
//driver class for custom exception
public class Executor {

	public static void main(String[] args) throws Logincredentials  {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		//validating
		if(id!="skumbhalkar@tnsif.org" && password!="123abc")
		{
			throw new Logincredentials(id, password);
		}
		
			

		

	}

}