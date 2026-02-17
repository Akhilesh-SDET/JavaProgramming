package BasicJavaProgramming;

public class A014_CountNumberOfDigitInGivenNumber {
	public static void main(String[] args) {
       int num=848203;
       int sum=0;
       int count=0;
       while(num>0) {
    	   sum=sum+num%10;
    	   count++;
    	   num=num/10;
       }
       System.out.println(sum);
       System.out.println(count);
	}
}
