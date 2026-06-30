package interviewBasedJavaProgramming;

public class String11_SecondHighestLengthInWordString {
	public static void main(String[] args) {
		String str="Hi Hello Welcome abcde";//print second highest length word
		String[] st = str.split(" ");
		String max1=st[0];
		String max2=st[0];
		for (int i = 0; i < st.length; i++) {
			if(st[i].length()>max1.length()) {
				max2=max1;
				max1=st[i];
			}else if(st[i].length()>max2.length()) {
				max2=st[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);
	}
}
