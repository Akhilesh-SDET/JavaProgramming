package stringBsedJavaProgramming;

public class A038_ReverseStringWithoutChangingThePositionOfSpace {
	public static void main(String[] args) {
		String str="I am selenium";//m ui nelesmaI
		String st = str.replace(" ", "");
		int length = st.length()-1 ;
		for (int i = 0; i <str.length(); i++) {
			if(str.charAt(i)!=' ') {
				System.out.print(st.charAt(length--));
			}else {
				System.out.print(str.charAt(i));
			}
		}
	}
}
