package OOPSConcepts;

public class A006_NonStaticBlockIntilizer {
	{
		System.out.println("Non static block executed");
	}

	A006_NonStaticBlockIntilizer() {
		System.out.println("Constructor Executed");
	}

	public static void main(String[] args) {
		A006_NonStaticBlockIntilizer obj1 = new A006_NonStaticBlockIntilizer();
		A006_NonStaticBlockIntilizer obj2 = new A006_NonStaticBlockIntilizer();
		System.out.println("End Of Main method Execution");
	}
}
