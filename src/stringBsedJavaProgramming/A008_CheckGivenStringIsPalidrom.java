package stringBsedJavaProgramming;

public class A008_CheckGivenStringIsPalidrom {
	public static void main(String[] args) {
          String str= "Malayalam";
          String st= str.toLowerCase();
          String res="";
          for (int i = st.length()-1; i >=0; i--) {
			res=res+st.charAt(i);
		}
          if(st.equals(res)) {
        	  System.out.println(" palindrom ");
          }else {
        	  System.out.println(" Not Palindrom ");
          }
	}
}
