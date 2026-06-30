package pratice2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A003_ArraySortingWitoutUsingInbuildMethod {
	public static void main(String[] args) {
		int[] a = { 1, 2, 0, 3, 0, 4, 0, 0, 7, 8 };
        
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length-1; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	System.out.println(Arrays.toString(a));
	}
}
