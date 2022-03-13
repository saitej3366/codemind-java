import java.util.*;
class happynumber {
    public static int isHappyNumber(int num) {
    	
    int sum=0;
     while(num>0) {
    	 int r=num%10;
    	 sum+=(int)Math.pow(r, 2);
    	 num/=10; 
       }
    
    return sum;
    }
 
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int temp=num;
	while(temp!=1&&temp!=4) {
		temp=isHappyNumber(temp);
	}
	if(temp==1) {
		System.out.println("True");
	}else if(temp==4) {
		System.out.println("False");
	}
	
}
}