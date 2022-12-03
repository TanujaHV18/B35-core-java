package org.tnsindia.PolymorphismDemo;

public class MethodoveriddingExecutor {

	public static void main(String[] args) {
		Methodoveriddingchild m=new Methodoveriddingchild();
		Methodoveriddingchild m1=new Methodoveriddingchild();
		System.out.println(m.mul(12, 10));//child class method
		System.out.println(m1.mul(10, 20));//parent class method

	}


	}


