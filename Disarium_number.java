import java.util.*;
class s{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String a=String.valueOf(num);
        int b=a.length();
        int temp=num;
        double sum=0;
        while(num>0&&b>0){
            int r=num%10;
           sum+=Math.pow(r, b);
 		     b--;
      
            num/=10;
        }
        int s=(int)sum;
        if(temp==s){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
