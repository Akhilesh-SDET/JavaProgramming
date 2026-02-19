package interviewBasedJavaProgramming;

public class A001_PrintOneToTenWithoutLoop {
	public static void main(String[] args) {
        display(1,10); 
	}
	public static void display(int start, int end) {
		if(start<=end) {
			System.out.println(start);
			start++;
			display(start,end);
		}
		
	}
}
