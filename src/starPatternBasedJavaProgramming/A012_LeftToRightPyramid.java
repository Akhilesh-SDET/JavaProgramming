package starPatternBasedJavaProgramming;

public class A012_LeftToRightPyramid {
	public static void main(String[] args) {
		int size = 6;
		for (int i = 1; i <= size * 2 - 1; i++) {
			for (int j = 1; j <= size; j++) {
				if (i >=j && i+j<=size*2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
