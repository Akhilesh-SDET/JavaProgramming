package pratice2;

public class A010_SecondHighestNumber {
	public static void main(String[] args) {
          int[] a= {1,5,2,9,7,8,6};
          int max1=a[0];
          int max2=0;
          for (int i = 0; i < a.length; i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}else if(max2<a[i]){
				max2=a[i];
			}
		}
          System.out.println(max2);
	}
}
