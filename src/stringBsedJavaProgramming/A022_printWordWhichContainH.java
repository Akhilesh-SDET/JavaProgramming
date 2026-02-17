package stringBsedJavaProgramming;

public class A022_printWordWhichContainH {
	public static void main(String[] args) {
		String str="In The Boxes";
		String[] st = str.split(" ");
		for(String e:st) {
			if(e.toLowerCase().contains("h")) {
				System.out.println(e);
			}
		}
	}
}
