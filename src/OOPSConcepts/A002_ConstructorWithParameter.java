package OOPSConcepts;

public class A002_ConstructorWithParameter {
	static String name = "Akhilesh";
	String addres;
	int houseNumber = 123;
	int contactNumber;

	public A002_ConstructorWithParameter(String add, int mobileNumber) {
		addres = add;
		mobileNumber = contactNumber;
	}

	public A002_ConstructorWithParameter(int mobileNumber, String add) {
		addres = add;
		contactNumber = mobileNumber;
	}

	public static void main(String[] args) {
		A002_ConstructorWithParameter obj1 = new A002_ConstructorWithParameter("BTM", 2141999999);
		System.out.println(obj1.name);// Akhilesh
		System.out.println(obj1.addres);// BTM
		System.out.println(obj1.houseNumber);// 123
		System.out.println(obj1.contactNumber);// 0 b/z assignment opertor work from right to left
		A002_ConstructorWithParameter obj2 = new A002_ConstructorWithParameter(2141999999, "BTM");
		System.out.println(obj2.name);// Akhilesh
		System.out.println(obj2.addres);// BTM
		System.out.println(obj2.houseNumber);// 123
		System.out.println(obj2.contactNumber);// 2141999999 b/z assignment opertor work from right to left

	}
}
/*
 * int max value almost 214cror and 10digit only
 */
