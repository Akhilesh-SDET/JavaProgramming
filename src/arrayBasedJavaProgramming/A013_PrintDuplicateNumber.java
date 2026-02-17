package arrayBasedJavaProgramming;

public class A013_PrintDuplicateNumber {
	public static void main(String[] args) {
		int[] a= {1,2,1,3,1,5,9,7,65,7,54,40,55,1,2,3};
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]) {
					if(i>j) {
						break;
					}else {
						count++;
					}
				}
			}
			if(count>1) {
				System.out.println(a[i]+"------> "+count);
			}
		}
	}
}
