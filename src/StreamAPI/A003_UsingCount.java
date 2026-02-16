package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class A003_UsingCount {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,10,15,20);
		 long filterList = list.stream()
				.filter(e-> e%2==0)
				.count();
		System.out.println(filterList);
	}
	}

