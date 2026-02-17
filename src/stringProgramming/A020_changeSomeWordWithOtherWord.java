package stringProgramming;

public class A020_changeSomeWordWithOtherWord {
	public static void main(String[] args) {
       String str="In The Boxes";//Boxes-->Boxesss
       String[] st = str.split(" ");
      for (int i = 0; i < st.length; i++) {
		if(st[i].equals("Boxes")) {
			st[i]="Boxesss";
		}
		System.out.println(st[i]);
	}
	}
}
