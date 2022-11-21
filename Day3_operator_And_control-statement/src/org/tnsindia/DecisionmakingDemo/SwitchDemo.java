package org.tnsindia.DecisionmakingDemo;

import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String num=s.next();
		
		//switch case to activate the caller-tune example
		switch(num)
		{
		case "Hi":
		{
			System.out.println("tumhiho");
			//break;
		}
		case "Hello":
		{
			System.out.println("charlie");
			break;
		}
		case "Cia":
		{
			System.out.println("paramathma");
			break;
		}
		default:
		{
			System.out.println("Invalid Input");
		}
		}

	}

}
