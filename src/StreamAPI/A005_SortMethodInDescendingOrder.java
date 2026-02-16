package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A005_SortMethodInDescendingOrder {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45, 70, 55, 5, 10, 15, 20);
		List<Integer> sortedElement = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(sortedElement);
	}
}
//sorted() → natural order (ascending)
//sorted(Comparator.reverseOrder()) → descending
//for any Decending order in java go to comparator Interface which have method
