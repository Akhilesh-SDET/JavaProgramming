package OOPSConcepts;

public class A001_ByDefaultConstructor {
	static String name = "Akhilesh";
	static String stream;
	String addres;
	String contactNumber;
	int houseNumber;

	public A001_ByDefaultConstructor() {// Optional

	}

	public static void main(String[] args) {
		A001_ByDefaultConstructor a1 = new A001_ByDefaultConstructor();
		System.out.println(a1.name);// Akhilesh
		System.out.println(a1.stream);// null
		System.out.println(a1.addres);// null
		System.out.println(a1.contactNumber);// null
		System.out.println(a1.houseNumber);// 0
	}

}
/*
 * Note: Bydefault value of global non premitive variable string is null but
 * local premitive variable have no bydefault value we must initilize the local
 * non premitive variable
 */
