package BasicJavaProgramming;

public class A013_sumOfEvenNumberInGivenRange {
	public static void main(String[] args) {
         int start=1;
         int end=100;
         int sum=0;
         while(start<=end) {
        	 if(start%2==0) {
        		 sum=sum+start;
        		 System.out.println(start);
        	 }
        	 start++;
         }
         System.out.println(sum);
	}
}
