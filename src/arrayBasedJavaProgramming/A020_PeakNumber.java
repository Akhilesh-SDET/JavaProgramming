package arrayBasedJavaProgramming;

public class A020_PeakNumber {
public static void main(String[] args) {
	int[] a= {9,6,8,4,7,10,};
	
	for (int i = 0; i < a.length; i++) {
		
		if(i!=0 && i!=a.length-1) {
			if(a[i]>a[i-1] && a[i]>a[i+1]) {
				System.out.println(a[i]);
			}
			}else if(i==0 && a[i]>a[i+1]) {
				System.out.println(a[i]);
			}else if(i==a.length-1 && a[i]>a[i-1]) {
				System.out.println(a[i]);
			}
		
	}
}
}
