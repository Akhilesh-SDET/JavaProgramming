package BasicJavaProgram;

public class A021_NthPrimeNumber {
	public static void main(String[] args) {
		int nthPrime = 0;
		int i = 1;
		while (i > 0) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				nthPrime++;
				System.out.println(i);
				if (nthPrime == 7) {
					System.out.println(i);
					break;
				}
			}
			i++;
		}
	}
}
