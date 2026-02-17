package BasicJavaProgram;
public class A016_FindTheEvenDigitInWithinGivenNumber {
         public static void main(String[] args) {
			int num=123789;
			while(num>0) {
				int temp=num%10;
				if(temp%2==0) {
					System.out.println(temp);
				}
				num=num/10;
			}
		}
}
