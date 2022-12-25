package org.tnsindia.client;

import org.tnsindia.application.MMBankFactory;
import org.tnsindia.application.MMCurrentAcc;
import org.tnsindia.application.MMSavingAcc;

class Client {
	
	public static void main(String args[]) {
	
		
			MMBankFactory b =new 	MMBankFactory ();
			MMSavingAcc s= new MMSavingAcc(98563212,"Harshitha", 50000, true);
			MMCurrentAcc c = new MMCurrentAcc(56987417,"Ashwini", 40000,10000);
			
			System.out.println("Saving Account");
			s.withdraw(s.getAccBal());
			
			System.out.println();
			
			System.out.println("Current Account");
			c.withdraw(c.getAccBal());
			
			System.out.println();
			
		    System.out.println(s);
		    System.out.println(c);
		    
		   
	}

}

