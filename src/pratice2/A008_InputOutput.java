package pratice2;

public class A008_InputOutput {
	public static void main(String[] args) {
        String str="aaabbbcdaaaac";//a1b4c1d1a3c3
        int count=1;
        String result="";
        for (int i = 0; i <str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}else {
				System.out.println(str.charAt(i)+""+count);
				result=result+str.charAt(i)+""+count;
				count=1;
			}
		}
             result=result+str.charAt(str.length()-1)+""+count;
        System.out.println(str.charAt(str.length()-1)+""+count);
        System.out.println(result);
        
        String st = result.replaceAll("[a-zA-Z]", "");
        int length = st.length()-1;
        System.out.println(st);
        for (int i = 0; i <result.length(); i++) {
			if(!Character.isDigit(result.charAt(i))) {
				System.out.print(result.charAt(i));
			}else {
				System.out.print(st.charAt(length--));
			}
		}
        
	}
}

//"I am Selenium";
//m ui 
