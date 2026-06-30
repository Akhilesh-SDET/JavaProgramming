package stringBsedJavaProgramming;

public class A41_TargetNumber {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] + a[j] == 9) {
					if (i > j) {
						break;
					} else {
						// System.out.println(a[i]+a[j]);
						System.out.println("Sum of " + a[i] + " And " + a[j] + " is " + (a[i] + a[j]));
					}
				}
			}
		}

	}
}
