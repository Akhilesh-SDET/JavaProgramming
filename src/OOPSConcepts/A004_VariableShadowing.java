package OOPSConcepts;

public class A004_VariableShadowing {
	static int price = 10;

	public static void main(String[] args) {
		int price = 20;
		System.out.println(price);// 20
		System.out.println(A004_VariableShadowing.price);// 10
	}
}
