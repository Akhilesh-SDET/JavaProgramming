package OOPSConcepts.Encapsulation;

public class A002_AccessOfPrivateDataFromAccountClass {
	public static void main(String[] args) {
          A001_Account a1 = new A001_Account(01234, 50000);
         // System.out.println(a1.blance);//private member not visible in other class
          System.out.println(a1.getBlance());
          a1.setBlance(40000);
          System.out.println(a1.getBlance());
	}
}
