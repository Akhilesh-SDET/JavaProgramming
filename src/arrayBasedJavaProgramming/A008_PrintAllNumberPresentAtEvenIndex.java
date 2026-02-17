package arrayBasedJavaProgramming;

public class A008_PrintAllNumberPresentAtEvenIndex {
	public static void main(String[] args) {
		 int[] a= {10,20,15,30,25};
		 for (int i = 0; i < a.length; i++) {
			 if(i%2==0) {
				 System.out.println(a[i]);
			 }
		 }
	}
}
