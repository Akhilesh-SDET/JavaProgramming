package ArrayJavaProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A005_ArrangeTheArrayValuesInDescendingOrder {
	public static void main(String[] args) {
		int[] a = { 50, 8, 25, 18, 20 };
		List<Integer> filterList = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).toList();

		System.out.println(filterList);

	}
}
