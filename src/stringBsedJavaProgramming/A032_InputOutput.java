package stringBsedJavaProgramming;

public class A032_InputOutput {
	public static void main(String[] args) {
          String str="Hello";//H-e--l---l----o
          int count=0;
          for (int i = 0; i <str.length(); i++) {
        	  int temp = count;
        	  while(temp>0) {
			System.out.print("-");
			temp--;
        	  }
        	  count++;
        	  System.out.print(str.charAt(i));
		}
	}
}
