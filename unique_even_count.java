import java.util.*;
class UniqueSum {
    static int usum(int a[],int n) {
    	Arrays.sort(a);
    	int c=0;
    	if(a[0]%2==0) {
    		c=1;
    	}
    	for(int i=0;i<n-1;i++) {
    		if(a[i]!=a[i+1]&&a[i+1]%2==0) {
    			c+=1;
    		}
    	}
      return c;	
    }
	public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       int b[]=new int[n];
       for(int i=0;i<n;i++) {
    	   a[i]=sc.nextInt();
       }
       System.out.println(usum(a,n));
	}

}