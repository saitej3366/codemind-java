
import java.util.Scanner;
class p{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        while(temp>0){
            for(int i=n;i>=1;i--){
                System.out.print(i+" ");
            }
            System.out.println();
            temp--;
        }
    }
}
