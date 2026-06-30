package OOPSConcepts.Encapsulation;

public class A002_AccessOfPrivateDataFromAccountClass {
	public static void main(String[] args) {
		A001_Account ac= new A001_Account(8877,40000);
		ac.setPin();
		ac.getBalance();
         
	}
}
