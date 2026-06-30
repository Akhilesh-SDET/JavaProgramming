package interviewBasedJavaProgramming;

public class String18_ReverseTheNumber {
	public static void main(String[] args) {
       int number=848203;
       int temp=number;
       int res=0;
       while(temp>0) {
    	   int last =temp%10;
    	   res=res*10+last;
    	   temp=temp/10;
       }
       System.out.println(res);
	}
}
