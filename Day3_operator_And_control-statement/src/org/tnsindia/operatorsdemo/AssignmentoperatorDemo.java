package org.tnsindia.operatorsdemo;

import java.util.Scanner;

public class AssignmentoperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a and b:");
		int a=s.nextInt();//9
		int b=s.nextInt();//5
		a*=b;//a=a*b//a=45
		System.out.println("The value of a is: "+a);
		s.close();


	}

}
