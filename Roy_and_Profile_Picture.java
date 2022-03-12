import java.util.*;
 class roy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=0,h=0,L=0,N=0;
		Scanner sc = new Scanner(System.in);
		 L = sc.nextInt();
		N=sc.nextInt();
		 while(N!=0) {
			 w =sc.nextInt();
		     h= sc.nextInt();
		  	
		  if(w<L||h<L) {
				System.out.println("UPLOAD ANOTHER");
				}else if(w==h)
				{
					System.out.println("ACCEPTED");
				}else {
					System.out.println("CROP IT");
				}
		     N--;
		}
				
	}

}
