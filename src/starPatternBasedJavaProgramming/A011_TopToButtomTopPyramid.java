package starPatternBasedJavaProgramming;

public class A011_TopToButtomTopPyramid {
	public static void main(String[] args) {
		int size = 5;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size*2-1; j++) {
				if (i<=j && i+j<=size*2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
