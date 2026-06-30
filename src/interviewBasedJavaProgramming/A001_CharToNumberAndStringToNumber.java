package interviewBasedJavaProgramming;

public class A001_CharToNumberAndStringToNumber {
	public static void main(String[] args) {
		char ch ='9';
		String st="9";
//==========================convert both char and string in number value=======================	
		int numFromChar=Character.getNumericValue(ch);
		int numFromString=Integer.parseInt(st);
		System.out.println(numFromChar);
		System.out.println(numFromString);
		
	}
}
