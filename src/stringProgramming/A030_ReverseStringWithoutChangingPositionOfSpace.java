package stringProgramming;

public class A030_ReverseStringWithoutChangingPositionOfSpace {
	public static void main(String[] args) {
         String str="I am Selenium";
         String st = str.replace(" ", "");
         int length = st.length()-1;
         String res="";
         for (int i = 0; i < str.length(); i++){
			if(str.charAt(i)!=' ') {
				res=res+st.charAt(length--);
			}else {
				res=res+str.charAt(i);
			}
		}
         System.out.println(res);
	}
}
