import java.util.Scanner;
class p{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0){
            for(int i=1;i<=n;i++){
                System.out.print(i);
            }
            System.out.println();
            n--;
        }
    }
}