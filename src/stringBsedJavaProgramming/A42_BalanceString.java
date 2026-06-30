package stringBsedJavaProgramming;

import java.util.ArrayList;
import java.util.List;

public class A42_BalanceString {
	public static void main(String[] args) {
		String str="{[()]}";
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < str.length()	; i++) {
			char ch=str.charAt(i);
			if(!list.isEmpty() &&
					(ch==']' && list.get(list.size()-1)=='[') ||
					(ch=='}' && list.get(list.size()-1)=='{') ||
					(ch==')' && list.get(list.size()-1)=='(')){
				list.remove(list.get(list.size()-1));
			}else {
				list.add(ch);
			}
		}
        if(list.isEmpty()) {
        	System.out.println("String is Balance");
        }else {
        	System.out.println("String is not Balance");
        }
	}
}
