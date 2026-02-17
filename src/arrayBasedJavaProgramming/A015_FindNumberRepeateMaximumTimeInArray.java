package arrayBasedJavaProgramming;

public class A015_FindNumberRepeateMaximumTimeInArray {
	public static void main(String[] args) {
       int[] a= {4,1,2,1,1,0};
       int max=0;
       int num=0;
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
			if(count>max) {
				max=count;
				num=a[i];
			}
		}
	}
       System.out.println(num+"--Repitations--> "+max);
	}
}
