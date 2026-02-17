package BasicJavaProgramming;

public class A015_SumOfNumberWithinRange {
public static void main(String[] args) {
	int a=1;
	int b=100;
	int sum=0;
	for (int i = a; i <=b; i++) {
		sum=sum+i;
	}
	System.out.println(sum);
}
}
