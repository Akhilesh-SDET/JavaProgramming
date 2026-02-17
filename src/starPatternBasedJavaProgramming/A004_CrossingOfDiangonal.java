package starPatternBasedJavaProgramming;

public class A004_CrossingOfDiangonal {
	public static void main(String[] args) {
		int size = 5;
		for (int i = 1; i <= size * 2 - 1; i++) {
			for (int j = 1; j <= size * 2 - 1; j++) {
				if (i == j || i + j == size * 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
