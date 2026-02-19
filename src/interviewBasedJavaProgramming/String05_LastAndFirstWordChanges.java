package interviewBasedJavaProgramming;

public class String05_LastAndFirstWordChanges {
	public static void main(String[] args) {
		String str="Hi Hello Welcome to";//to Hello Welcome Hi
		String[] st = str.split(" ");
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		String  res="";
		for(String e: st) {
			res=res+e+" ";
		}
		System.out.println(res.trim());
		
		
		
	}
}
