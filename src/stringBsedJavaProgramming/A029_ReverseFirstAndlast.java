package stringBsedJavaProgramming;

public class A029_ReverseFirstAndlast {
	public static void main(String[] args) {
          String str="Hi,Hello,Welcome,To";//o/p-To Hello Welcome Hi
          String[] st = str.split(",");
         String temp=st[0];
         st[0]=st[st.length-1];
         st[st.length-1]=temp;
         String res="";
         for(String e: st) {
        	 res=res+e+" ";
         }
         System.out.println(res.trim());
	}
}
