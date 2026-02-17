package BasicJavaProgramming;

public class A018_CheckGivenNumberIsPalindrom {
	public static void main(String[] args) {
          int number=12321;
          int num=number;
          int res=0;
          while(num!=0) {
        	  res=res*10+num%10;
        	  num=num/10;
          }
          System.out.println(number==res?"Given number is palindrom":"Given Number is not palindrom");
	}
}
