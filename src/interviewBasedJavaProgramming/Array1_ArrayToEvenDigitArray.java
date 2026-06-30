package interviewBasedJavaProgramming;

public class Array1_ArrayToEvenDigitArray {
	public static void main(String[] args) {
		int[] a = { 10, 30, 25, 60, 87, 45, 6,8};
		int count=0;
		for(int e: a) {
			if(e%2==0) {
				count++;
			}
		}
		int[] b= new int[count];
		int size=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
			b[size++]=a[i];
			System.out.println(b[size-1]);
			}
		}
		
		}
	
}
