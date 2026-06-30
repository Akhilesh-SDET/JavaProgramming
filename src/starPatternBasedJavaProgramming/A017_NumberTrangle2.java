package starPatternBasedJavaProgramming;

public class A017_NumberTrangle2 {
	public static void main(String[] args) {
		int size =5;
		for(int i=1;i<=size;i++) {
			int temp=1;
			for(int j=1; j<=size; j++) {
				if(i+j>=size+1) {
					System.out.print(temp+" ");
					temp++;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
