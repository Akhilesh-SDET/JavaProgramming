package interviewBasedJavaProgramming;

public class Array6_SeperateAlmostSimilarWord {
	public static void main(String[] args) {
		String[] str = { "K1", "V1", "K2", "V2" };// k1 k2 v1 v2
		String k = "";
		String v = "";
		for (int i = 0; i < str.length; i++) {
			if (str[i].contains("K")) {
				k = k + str[i] + " ";
			} else {
				v = v + str[i] + " ";
			}
		}
		System.out.println(k + v);
	}
}
