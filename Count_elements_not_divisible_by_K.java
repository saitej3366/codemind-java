import java.util.*;
class demo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int N=sc.nextInt();
		int K=sc.nextInt();
		int a[]=new int[N];
     for(int i=0;i< a.length;i++) {
    	 a[i]=sc.nextInt();
     }
     for(int i=0;i<a.length;i++) {
    	 if(a[i]%K==0) {
    		 
    		 count+=1;
    	 }
     }
     System.out.println(N-count);
	}

}
