import java.util.*;
 class arraylist {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int temp=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
    Arrays.sort(a);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       if(n2<n1) {
    	 temp=n2;
    	 n2=n1;
    	 n1=temp;
       }
       int c=0;
       for (int i = 0; i < n; i++) {
			if (a[i] >= n1 && a[i] <= n2) {
				System.out.print(a[i]+" ");
				c++;
				break;
				
			}	
		
		}
       if(c==0) {
    	   System.out.println(-1);
       }
        
	}     
 }
	