import java.util.*;
class basic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=0;
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            s+=n-i;
        }
        System.out.println(s);
    }
}