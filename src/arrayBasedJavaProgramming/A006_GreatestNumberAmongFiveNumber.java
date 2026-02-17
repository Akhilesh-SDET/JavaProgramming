package arrayBasedJavaProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A006_GreatestNumberAmongFiveNumber {
	public static void main(String[] args) {
		 int[] a= {10,20,15,30,25};
		 List<Integer> filterdata = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).toList();
		 System.out.println(filterdata.get(0));
	}
}
