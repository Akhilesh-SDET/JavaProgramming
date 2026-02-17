package arrayProgramming;

public class A016_InputOutPut {
	public static void main(String[] args) {
         int[] a= {0,4,0,2,0,6};
         int[] res= new int[a.length];
         int m=0;
         int n=res.length-1;
         for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				res[m]=a[i];
				m++;
			}else {
				res[n]=a[i];
				n--;
			}
		}
         for(int e:res) {
        	 System.out.println(e);
         }
	}
}
