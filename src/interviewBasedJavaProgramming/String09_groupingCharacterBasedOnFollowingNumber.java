package interviewBasedJavaProgramming;

public class String09_groupingCharacterBasedOnFollowingNumber {
	public static void main(String[] args) {
		String str = "a2b2cd3gg";
		for (int i = 0; i < str.length(); i++) {
			
			if (Character.isDigit(str.charAt(i))) {
				int count = Integer.parseInt(String.valueOf(str.charAt(i)));
				while (count > 1) {
					System.out.print(str.charAt(i - 1));
					count--;
				}

			} else {
				System.out.print(str.charAt(i));
			}
		}

	}
}
