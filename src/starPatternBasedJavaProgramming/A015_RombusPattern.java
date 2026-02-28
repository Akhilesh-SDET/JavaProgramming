package starPatternBasedJavaProgramming;

public class A015_RombusPattern {
	public static void main(String[] args) {
		int size = 6;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size * 2 - 1; j++) {
				if (i+j>=size+1 && i+j<=size*2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
