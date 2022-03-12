import java.util.*;
class sk{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
}