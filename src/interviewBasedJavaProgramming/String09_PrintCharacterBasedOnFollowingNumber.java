package interviewBasedJavaProgramming;

public class String09_PrintCharacterBasedOnFollowingNumber {
	public static void main(String[] args) {
		String str="a2b2cd3gg";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>='0' &&str.charAt(i)<='9') {
				int num=(int)str.charAt(i)-48;
				while(num>1) {
					System.out.print(str.charAt(i-1));
					num--;
				}
				
			}else {
			System.out.print(str.charAt(i));
			}
			
		}
	}
}
