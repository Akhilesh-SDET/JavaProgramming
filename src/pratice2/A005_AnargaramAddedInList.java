package pratice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A005_AnargaramAddedInList {

	public static void main(String[] args) {
		String[] str = { "eat", "tea", "ate", "bat", "tab" };
		List<List<String>> result = new ArrayList<List<String>>();

		for (int i = 0; i < str.length; i++) {
			if (str[i] == null) {
				continue;
			}
			List<String> list = new ArrayList<String>();
			list.add(str[i]);

			for (int j = i + 1; j < str.length; j++) {

				if (display(str[i], str[j])) {
					list.add(str[j]);
					str[j] = null;
				}
			}
			result.add(list);
		}
		System.out.println(result);
	}

	public static boolean display(String s1, String s2) {
		char[] a1 = s1.toLowerCase().toCharArray();
		char[] a2 = s2.toLowerCase().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);

		return Arrays.equals(a1, a2);
	}
}
