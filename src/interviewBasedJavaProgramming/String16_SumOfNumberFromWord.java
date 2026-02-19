package interviewBasedJavaProgramming;

public class String16_SumOfNumberFromWord {
	public static void main(String[] args) {
		String str="a120b2c300%$41g";
		String[] st = str.split("[^0-9]+");
		int res=0;
		for(String e:st) {
			if(!e.isEmpty())
			res=res+Integer.parseInt(e);
		}
		System.out.println(res);
	}
}
