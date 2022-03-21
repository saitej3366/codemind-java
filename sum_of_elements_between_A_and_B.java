import java.util.*;
 class arraylist {
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
       int n1=sc.nextInt();
       int n2=sc.nextInt();
        while (n1<=n2) {
        	for(int i=0;i<n;i++) {
        		if(a[i]==n1) {
        			sum+=a[i];
        		}
        		
        	}
			n1=n1+1;
		}
        System.out.println(sum);
        }
	
	
	}