package interviewBasedJavaProgramming;

public class String15_SumOfDigitFromWord {
	public static void main(String[] args) {
		String str="a120b2c300%$41g1"; //10
		String st = str.replaceAll("[^0-9]", "");
		System.out.println(st);
		int res=0;
		for (int i = 0; i <st.length(); i++) {
			res=res+(int)st.charAt(i)-48;
		}
		System.out.println(res);
	}
}
