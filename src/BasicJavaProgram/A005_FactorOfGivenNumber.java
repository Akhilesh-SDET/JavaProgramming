package BasicJavaProgram;

public class A005_FactorOfGivenNumber {
	public static void main(String[] args) {
		int number=16;
		int num=number;
		int count=0;
		for (int i = 1; i <=num; i++) {
			if(num%i==0) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Total Number Of factorial Of "+number+" are :"+count);
          
	}
}
