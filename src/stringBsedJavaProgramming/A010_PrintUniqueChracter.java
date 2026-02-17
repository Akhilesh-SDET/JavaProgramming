package stringBsedJavaProgramming;

public class A010_PrintUniqueChracter {
	public static void main(String[] args) {
        String str="Bengaluru";
       String st = str.toLowerCase();
        for (int i = 0; i <st.length(); i++) {
        	int count=0;
			for (int j = 0; j <st.length(); j++) {
				if(st.charAt(i)==st.charAt(j)) {
					if(i>j) {
						break;
					}else {
						count++;
					}
				}
			}
			if(count==1) {
				System.out.println(str.charAt(i)+"  occurance "+count);
			}
		}
	}
}
