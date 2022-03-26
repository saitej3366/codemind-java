import java.util.*;
 class UniqueSum {
	public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++){
    	 
         a[i]=sc.nextInt();
     }
     if(n%2==0) {
    	 for(int j=0;j<n/2;j++){
    		 System.out.print(a[j]+" "+a[(n-j)-1]+" ");           
        }
     }else {
    	 for(int j=0;j<n/2;j++){
    		 System.out.print(a[j]+" "+a[(n-j)-1]+" ");           
        }
    	 System.out.print(a[n/2]+" "+0);
     }
     }

}