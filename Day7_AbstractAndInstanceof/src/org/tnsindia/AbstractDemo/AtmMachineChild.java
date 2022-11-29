package org.tnsindia.AbstractDemo;

public class AtmMachineChild extends AtmMachine {

	//provided the implementation to abstarct method of parent class
		@Override
		void withdraw() {
			
			int balance=50000;
			System.out.println("Withdrawing amount is: "+balance);
			
		}
}
