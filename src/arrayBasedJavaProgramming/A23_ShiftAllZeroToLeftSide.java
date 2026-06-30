package arrayBasedJavaProgramming;

import java.util.Arrays;

public class A23_ShiftAllZeroToLeftSide {
	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6 };
          int index=a.length-1;
          
		for (int i = a.length-1; i>=0; i--) {			
             if(a[i] !=0) {
            	  a[index] =a[i];
            	  index--;
             }
		}
		while(index>=0) {
			a[index]=0;
			index--;
		}
		System.out.println(Arrays.toString(a));
	}
}
