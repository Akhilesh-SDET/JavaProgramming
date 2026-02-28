package OOPSConcepts;

public class A007_CombinationOfStaticAndNonStaticBlockIntilizer {
	int rollno;
	String name;

	public A007_CombinationOfStaticAndNonStaticBlockIntilizer(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	{
		System.out.println("Your Details are loading Please wait");
	}
	static {
		System.out.println("Welcome to deetails page please wait ");
		A007_CombinationOfStaticAndNonStaticBlockIntilizer obj1 = new A007_CombinationOfStaticAndNonStaticBlockIntilizer(
				101, "Akii");
		A007_CombinationOfStaticAndNonStaticBlockIntilizer obj2 = new A007_CombinationOfStaticAndNonStaticBlockIntilizer(
				102, "Bikku");
		obj1.details();
		obj2.details();
	}

	public void details() {
		System.out.println("RollNo is " + rollno);
		System.out.println("Name is " + name);
	}

	public static void main(String[] args) {
		System.out.println("Execution Ended ");
	}
}

// Welcome to details page please wait
// Your Details are loading Please wait
// Your Details are loading Please wait
// RollNo is 101
// Name is Akii
// RollNo is 102
// Name is Bikku
// Execution Ended
