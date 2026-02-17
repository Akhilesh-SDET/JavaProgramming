package BasicJavaProgram;

public class A012_XylemNumber {
	public static void main(String[] args) {
         int number=111225;
         int last=number%10;
         int first=0;
         int res=0;
         int num=number/10;
         while(num>=10) {
        	 res=res+num%10;
        	 num=num/10;
         }
         first=num;
        	System.out.println(res==(first+last)? "Xylem number":"Not Xylem Number");
	}
}
