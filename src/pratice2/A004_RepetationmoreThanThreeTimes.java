package pratice2;

import java.util.ArrayList;
import java.util.List;

public class A004_RepetationmoreThanThreeTimes {
public static void main(String[] args) {
	int[] a= {1,1,1,2,2,3};
	List<Integer> list = new ArrayList<Integer>();
	int k=2;
	
	for (int i = 0; i < a.length; i++) {
		int count=0;
		for (int j = 0; j < a.length; j++) {
			if(a[i]==a[j]) {
				if(i>j) {
					break;
				}else {
					count++;
				}
			}
		}
		if(count>=k) {
			list.add(a[i]);
		}
	}
	System.out.println(list);
}
}
