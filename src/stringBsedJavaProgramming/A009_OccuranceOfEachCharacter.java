package stringBsedJavaProgramming;

public class A009_OccuranceOfEachCharacter {
	public static void main(String[] args) {
		String str="Bengalurububna";
		String st = str.toLowerCase();
		for (int i = 0; i <st.length(); i++) {
			int count = 0;
			for (int j = 0; j <st.length(); j++) {
				if(st.charAt(i)==st.charAt(j)) {
					if(i>j) {
						break;
					}else {
						count++;
					}
				}
				
			}
			if(count>=1) {
				System.out.println("occurance of "+str.charAt(i)+" is "+count);
			}
		}
	}
}
