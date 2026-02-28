package OOPSConcepts;

public class A005_StaticBlockInitilizer {

	static {
		System.out.println(10 + 20);
	}

	public static void add() {
		System.out.println(100 + 200);
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		add();
		add();
	}
}
//O/P----->
//         30
//         Hello
//         300
//         300
