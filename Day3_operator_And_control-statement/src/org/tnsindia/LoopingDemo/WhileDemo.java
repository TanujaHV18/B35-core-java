package org.tnsindia.LoopingDemo;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();//5
		int i=1;
		/*if you don't know the no.of iteration then use while loop*/
		while(i<=num)
		{
			System.out.println("Welcome to Java "+i);
			i++;

		}
		
	}

}
