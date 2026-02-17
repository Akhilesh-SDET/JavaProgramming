package stringProgramming;

public class A028_createStringStartingWithDigitThanChracter {
	public static void main(String[] args) {
	    String str="27 No 24 Sound 54";
        String[] st = str.split(" ");// |No|24|Sound|
        String digit="";
        String word="";
        for(String e:st) {
        	if(e.matches("\\d+")) {
        digit+=e+" ";
        }else {
        	word+=e+" ";
        }
        }
       System.out.println(digit+word.trim()); 
	}
}
