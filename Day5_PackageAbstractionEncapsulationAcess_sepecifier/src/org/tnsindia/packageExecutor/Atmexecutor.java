package org.tnsindia.packageExecutor;

import java.util.Scanner;

import org.tnsindia.Packagesdemo.Atm;
//driver class
public class Atmexecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the card no: ");
		String card_no=s.nextLine();
		Atm obj=new Atm();
		obj.display(card_no);
		

	}
		
	}

