package pratice2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class permutations {
	
	static Set<String> set;
	static List<String> list;
	
	public static void main(String[] args) {
		set = new HashSet<String>();
		list= new ArrayList<String>();
		String str="aba";
		
		permute(str,"");	
		System.out.println(set);
		System.out.println(list);
		}
	
	public static void permute(String str, String ans) {
         if(str.length()==0) {
        	 set.add(ans);
        	 list.add(ans);
        	 return;
         } 
         for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
           String ros = str.substring(0,i)+str.substring(i+1);//""+b
           permute(ros,ans+ch);
         }
	}
}
