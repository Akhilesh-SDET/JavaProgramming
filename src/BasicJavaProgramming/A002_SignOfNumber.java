package BasicJavaProgramming;

public class A002_SignOfNumber {
  public static String display(int n) {
	  if(n>0) {
		  return "positive";
	  }else if(n<0) {
		  return "Negative";
	  }
	  return "Zero";
  }
  public static void main(String[] args) {
	System.out.println(display(5));
}
}
