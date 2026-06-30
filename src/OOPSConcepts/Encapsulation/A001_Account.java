package OOPSConcepts.Encapsulation;

import java.util.Scanner;

public class A001_Account {
   private int pin;
   private double balance;
   public A001_Account(int pin, double blance) {
	this.pin = pin;
	this.balance = blance;
   }
   public double getBalance() {
	   System.out.println("Enter your PIN");
	   Scanner sc =new Scanner(System.in);
	   int p=sc.nextInt();
	   if(pin==p) {
		   System.out.println("your balance is "+balance);
	   }else {
		   System.out.println("you have Entered wrong pin ");
	   }
	  sc.close();
	return balance;
   }
   
   public void setPin() {
	   System.out.println("Enter your old pin");
	   Scanner sc =new Scanner(System.in);
	   int p=sc.nextInt();
	   if(pin==p) {
		   System.out.println("Enter your new pin");
		   pin=sc.nextInt();
		   System.out.println("your pin has been updated successful");
	   }else {
		   System.out.println("Wrong pin");
	   }
	 
   }   
}
