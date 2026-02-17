package arrayProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A005_ArrangeTheArrayValuesInDescendingOrder {
	public static void main(String[] args) {
		 int[] a= {10,20,15,30,25};
		 List<Integer> filterdata = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).toList();
		 for(int e:filterdata) {
			 System.out.println(e);
		 }
	}
}
