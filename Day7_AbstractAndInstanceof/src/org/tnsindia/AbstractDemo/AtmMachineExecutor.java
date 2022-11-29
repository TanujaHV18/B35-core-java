package org.tnsindia.AbstractDemo;
//driver class
public class AtmMachineExecutor {

	public static void main(String[] args) {
		AtmMachine a=new AtmMachineChild();
		//AtmMachineChild a=new AtmMachineChild();
		a.withdraw();
		a.display();

	}


	}


