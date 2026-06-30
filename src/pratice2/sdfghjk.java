package pratice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sdfghjk {
public static void main(String[] args) {
	int[] num1= {1,2,3};
	int[] num2= {2,4,5};
	int length=num1.length+num2.length;
	int[] resarray=new int[length];
      List<Integer> list = new ArrayList<Integer>();
      
	for (int i = 0; i < length; i++) {
		if(i<num1.length) {
			resarray[i]=(num1[i]);
		}else {
			resarray[i]=(num2[i-num1.length]);
		}
	}
	
	Arrays.sort(resarray);
	System.out.println(Arrays.toString(resarray));
	
	
}
}
