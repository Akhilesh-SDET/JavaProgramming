package BasicJavaProgramming;

public class A017_sumOfFirstAndLastDigitOfNumber {
	public static void main(String[] args) {
         int number=1538;
         int first=0;
         int last = (number/10)%10;
         while(number>10) {
        	 first=number%10;
        	 number=number/10;
         }
         System.out.println(first+last);
	}
}
