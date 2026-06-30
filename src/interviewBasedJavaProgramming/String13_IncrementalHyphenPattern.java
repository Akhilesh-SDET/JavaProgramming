package interviewBasedJavaProgramming;

public class String13_IncrementalHyphenPattern {
	public static void main(String[] args) {
       String str="Hello";
       int count=1;
       for (int i = 0; i <str.length()-1; i++) {
    	   System.out.print(str.charAt(i));
    	   int temp=count;
    	   while(temp>0) {
		System.out.print("-");
		temp--;
    	   }
    	   count++;
	}
     System.out.print(str.charAt(str.length()-1));  
	}
}
