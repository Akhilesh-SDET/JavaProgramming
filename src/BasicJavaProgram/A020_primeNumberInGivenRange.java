package BasicJavaProgram;

public class A020_primeNumberInGivenRange {
	public static void main(String[] args) {
		int count2=0;
          for (int i = 1; i <100; i++) {
			int count=0;
			for (int j = 1; j <=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
				count2++;
			}
		}
          System.out.println("total"+count2);
	}
}
