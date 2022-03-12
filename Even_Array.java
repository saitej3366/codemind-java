import java.util.*;
class evenarray {

	public static void main(String[] args) {
	
   Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   int c=0;
   int a[] = new int[n];
   for(int i=0;i<n;i++) {
	   a[i]=sc.nextInt();
   }
   for(int i=0;i<n;i++) {
	   if(a[i]%2==0) {
		   c+=1;
	   }else {
		   break;
	   }
   }
     if(c==n) {
    	 System.out.println("True");
     }else {
    	 System.out.println("False");
     }
		// TODO Auto-generated method stub

	}

}
