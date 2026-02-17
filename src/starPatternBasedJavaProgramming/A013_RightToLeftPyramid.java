package starPatternBasedJavaProgramming;

public class A013_RightToLeftPyramid {
	public static void main(String[] args) {
		int size = 6;
		for (int i = 1; i <= size * 2 - 1; i++) {
			for (int j = 1; j <= size; j++) {
				if (i+j>=size+1 && i-j<=size-1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
