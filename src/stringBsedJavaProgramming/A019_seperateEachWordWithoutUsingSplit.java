package stringBsedJavaProgramming;

public class A019_seperateEachWordWithoutUsingSplit {
	public static void main(String[] args) {
		String str="In The Boxes";
		for (int i = 0; i <str.length(); i++) {
	            if(str.charAt(i)==' ') {
	            	System.out.println();
	            }else {
	            	System.out.print(str.charAt(i));
	            }
		}
	}

}
