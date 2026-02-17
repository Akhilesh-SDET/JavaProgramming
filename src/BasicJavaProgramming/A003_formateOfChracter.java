package BasicJavaProgramming;

public class A003_formateOfChracter {
	public static void main(String[] args) {
          char ch ='e';
          if(ch>='0' && ch <='9') {
        	  System.out.println("number");
        	  
          }else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
        	  System.out.println("alphabate");
        	  
          }else {
        	  System.out.println("special chracter");
          }
	}
}
