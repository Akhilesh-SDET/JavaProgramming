package interviewBasedJavaProgramming;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class String03_FindPalindromWhichHaveHighestFrequency {
	public static void main(String[] args) {
		String str = "dad mom dad child mom dad";
		String[] st = str.split(" ");
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		int count=0;
		String res="";
		for (int i = 0; i < st.length; i++) {
			if (ispalindrom(st[i])) {
				hm.put(st[i], (hm.getOrDefault(st[i], 0)) + 1);
			}
		}
		for(Entry<String,Integer> e : hm.entrySet()) {
			if(e.getValue()>count) {
				count=e.getValue();
				res=e.getKey();
			}
		}
          System.out.println(res);
	}

	public static boolean ispalindrom(String st) {
		int start = 0;
		int end = st.length() - 1;
		while (start < end) {
			if (st.charAt(start) != st.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
}
// when frequency are same for mom and dad that time i will follow insertion order if you wany last one 
 //than put equal and greater in if condition {e.getValue()>=count}



