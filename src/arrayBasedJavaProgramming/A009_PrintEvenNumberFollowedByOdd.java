package arrayBasedJavaProgramming;

public class A009_PrintEvenNumberFollowedByOdd {
	public static void main(String[] args) {
           int[] a= {5,12,4,21,8,2,3,7,9,11};
           for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
           for (int i = 0; i < a.length; i++) {
   			if(a[i]%2!=0) {
   				System.out.println(a[i]);
   			}
   		}
	}
}
