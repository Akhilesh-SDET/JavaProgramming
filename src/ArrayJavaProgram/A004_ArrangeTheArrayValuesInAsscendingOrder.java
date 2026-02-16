package ArrayJavaProgram;

import java.util.Arrays;

public class A004_ArrangeTheArrayValuesInAsscendingOrder {
		public static void main(String[] args) {
		      int[] a = {50,8,25,18,20};
		       Arrays.sort(a);// Arrays is class & sort is parameterized method 
		                      //sort method arrange the data in asscending order in same memory of array
		       for(int e : a) {
		    	   System.out.println(e);
		       }
		     
		}
	
}
