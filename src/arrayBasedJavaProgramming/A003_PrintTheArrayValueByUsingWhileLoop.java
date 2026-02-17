package arrayBasedJavaProgramming;

public class A003_PrintTheArrayValueByUsingWhileLoop {
	public static void main(String[] args) {
		 int[] a= {10,20,15,30,25};
		 int i=0;
		 while(i<=a.length-1) {
			 System.out.println(a[i]);
			 i++;
		 }
	}
}
