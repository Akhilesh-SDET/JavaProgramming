package interviewBasedJavaProgramming;

public class String11_OccuranceOfJavaWordInString {
	public static void main(String[] args) {
		String str="seljavamanualseljavamanualJavaselmanuual";
		String st = str.toLowerCase();
		String s="java";
		int count=0;
		for (int i = 0; i <=st.length()-s.length(); i++) {
			String temp=st.substring(i,i+s.length());
			if(temp.equals(s)) {
				count++;
			}
		}
		System.out.println(count);
}
}
