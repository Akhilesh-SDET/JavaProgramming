package ArrayJavaProgram;

public class A003_PrintTheArrayValueByUsingWhileLoop {
	public static void main(String[] args) {
        int[] a = {10,40,70,90,45,60};
       int i=0;
       while(i<=a.length-1) {
    	   System.out.println(a[i]);
    	   i++;
       }
	}
}
