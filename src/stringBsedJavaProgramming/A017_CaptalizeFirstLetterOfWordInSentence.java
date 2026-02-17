package stringBsedJavaProgramming;

public class A017_CaptalizeFirstLetterOfWordInSentence {
	public static void main(String[] args) {
          String str="in The boxes";
          String[] st = str.split(" ");
          for (int i = 0; i < st.length; i++) {
			String word = st[i];
			if(word.charAt(0)>='a' && word.charAt(0)<='z') {
				char temp=(char)(word.charAt(0)-32);
				st[i]=temp+st[i].substring(1);
			}
			System.out.println(st[i]);
		}
	}
}
