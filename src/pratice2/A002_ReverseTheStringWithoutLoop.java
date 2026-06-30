package pratice2;

public class A002_ReverseTheStringWithoutLoop {
	static String result="";
	
	public static void main(String[] args) {
        String str="Bengaluru";
        int size = str.length()-1;
        
        display(str,size);
       System.out.println(result);
       
	}
	
	public static void display(String s,int size) {
		
		if(size>=0) {
			result +=s.charAt(size);
			size--;
			display(s,size);
		}
	}
}
