package starPatternBasedJavaProgramming;

public class A014_Diamond {
	public static void main(String[] args) {
		int size = 5;
		for (int i = 1; i <= size * 2 - 1; i++) {
			for (int j = 1; j <= size * 2 - 1; j++) {
				if ((i + j <= size * 3 - 1 && i - j <= size - 1) && (j - i <= size - 1 && i + j >= size + 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
