
import java.util.*;
class p{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            String str=String.valueOf(a[i]);
            int r=(int)str.length();
            if(r%2==0){
                c+=1;
            }
        }
        System.out.println(c);
    }
}
