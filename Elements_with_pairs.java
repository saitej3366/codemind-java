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
    	 for(int j=0;j<n;j++){
    		 System.out.print(a[j]+" ");           
        }
     }else {
    	 for(int j=0;j<n;j++){
    		 System.out.print(a[j]+" ");           
        }
    	 System.out.print(0);
     }
     }

}