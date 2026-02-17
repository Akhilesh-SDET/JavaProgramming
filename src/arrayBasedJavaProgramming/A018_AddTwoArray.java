package arrayBasedJavaProgramming;

public class A018_AddTwoArray {
	public static void main(String[] args) {
		int[] a= {1,2,5};
		int[] b= {7,8,18,12};
		int[] c= new int[a.length+b.length];
		int length=a.length+ b.length;
		System.out.println(c.length);
		for (int i = 0; i < c.length; i++) {
			if(i<a.length) {
				c[i]=a[i];
				System.out.println(c[i]);
			}else {
				c[i]=b[i-a.length];
				System.out.println(c[i]);
			}
			
		}
	}
}
