import java.util.*;
 class uoc {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<n;i++) {
		
				a[i]=s.nextInt();
		}
      for(int i=0;i<a.length;i++) {
    	  if(a[i]%2==0){
    		  evencount+=1;
    		}else {
    			oddcount++;
    		}
       }
  
    	  System.out.print(evencount+" "+oddcount);
 
	}

}
