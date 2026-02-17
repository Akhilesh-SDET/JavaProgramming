package arrayBasedJavaProgramming;

public class A007_PrintOnlyEvenNumber {
public static void main(String[] args) {
	 int[] a= {10,20,15,30,25};
	 for(int e : a) {
		 if(e%2==0) {
			 System.out.println(e);
		 }
	 }
}
}
