package interviewBasedJavaProgramming;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class String21_IndexOfAllDuplicateCharacter {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 1, 2, 3, 3, 4 };
		LinkedHashMap<Integer, ArrayList> hash = new LinkedHashMap();
		
		for(int i=0; i<a.length; i++) {
			
			if(hash.containsKey(a[i])) {
				hash.get(a[i]).add(i);
			
			} else {
				hash.put(a[i], new ArrayList());
			}
		}
		for(Entry<Integer, ArrayList> map: hash.entrySet()) {
			if(map.getValue().size()>0) {
				System.out.println(map.getKey()+" "+map.getValue());
			}
		}

	}
}
