package StreamAPIBasedjavaProgramming;

import java.util.Arrays;
import java.util.List;

public class A001_UsingFilter {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(5,10,15,20);
	List<Integer> filterList = list.stream()
			.filter(e-> e%2==0)
			.toList();
	System.out.println(filterList);
}
}
//Filte----> Filter is used to filter the Data
//Number of Element is reduce in the case of using filter method

//Map----->manipulate the data of collection
//Number of Element is never reduce

