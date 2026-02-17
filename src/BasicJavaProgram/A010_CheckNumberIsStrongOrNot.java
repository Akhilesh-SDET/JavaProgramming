package BasicJavaProgram;

public class A010_CheckNumberIsStrongOrNot {
	public static int factorial(int n) {
    	int sum=1;
    	while(n!=0) {
    		sum=sum*n;
    		n--;
    	}
    	return sum;
    }
	public static void main(String[] args) {
            int num=145;
            int number=num;
            int sum=0;
            while(num !=0) {
            	int temp=num%10;
            sum=sum+	factorial(temp);
            	num=num/10;
            }
            System.out.println(sum);
	}
}
