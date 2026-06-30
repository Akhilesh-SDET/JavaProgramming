package OOPSConcepts.Encapsulation;

import java.util.Scanner;

public class B001_User {
	private long contact;

	public B001_User(long contact) {
		this.contact = contact;
	}

	public void setContact() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your Existing contract number ");
		int c = s.nextInt();
		if(c==contact) {
			System.out.println("Enter your new contact ");
			contact = s.nextInt();
			System.out.println("Your contact is successfullu updated");
			
		}else {
			System.out.println("You have Enter wrong contact number");
		}
		s.close();
	}
	



}
