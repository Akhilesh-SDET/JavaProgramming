package stringBsedJavaProgramming;

public class A40_MergeAndAddArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};//1
		int[] b= {2,3,4};//0
		
		for (int i = 0; i < a.length+b.length; i++) {
			if(i<a.length && i<b.length) {
				System.out.print(a[i]+b[i]);
				
			}else if(i>b.length-1 && i<=a.length-1) {
				System.out.println(a[i]);
			}else if(i>a.length-1 && i<=b.length-1) {
				System.out.print(b[i]);
			}
		}
		
	}
}
