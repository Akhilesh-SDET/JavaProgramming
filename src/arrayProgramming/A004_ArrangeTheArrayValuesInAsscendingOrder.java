package arrayProgramming;

import java.util.Arrays;

public class A004_ArrangeTheArrayValuesInAsscendingOrder {
	public static void main(String[] args) {
		 int[] a= {10,20,15,30,25};
		 Arrays.sort(a);
		 for(int e:a) {
			 System.out.println(e);
		 }
	}
}
