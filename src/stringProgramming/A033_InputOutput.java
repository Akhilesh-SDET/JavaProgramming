package stringProgramming;

public class A033_InputOutput {
	public static void main(String[] args) {
         String str="a2b2c1d1";//aa
                               //bb
                              //c
                             //d
         for (int i = 0; i<str.length(); i++) {
        	 if(str.charAt(i)>='0' && str.charAt(i)<='9') {
        		  int num = str.charAt(i)-48;
        		  char letter=str.charAt(i-1);
        		 
        		 while(num>0) {
        			 System.out.print(letter);
        			 num--;
        		 }
        		 System.out.println();
        	 }
		}
	}
}
