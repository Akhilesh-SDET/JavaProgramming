package BasicJavaProgramming;
public class A011_ArmstrongNumber {
	public static void main(String[] args) {
		int number=153;
		int num=number;
		int res=0;
		int power=totalDigit(number);
		
		while(num!=0) {
			int temp=num%10;
			int sum=1;
			for (int i = 1; i <=power; i++) {
				sum=sum*temp;
			} 
			res=res+sum;
			num=num/10;
		}
		System.out.println(res==number? "ArmStrong Number" : "Not ArmStrong Number");
	}

	public static int totalDigit(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
	}
	
}
