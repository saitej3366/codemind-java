import  java.util.*;
class p{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
            for(int i=65+(n-1);i>=65;i--){
                for(int j=1;j<=n;j++){
                System.out.print((char)i+" ");
                
            }
            n--;
            System.out.println();
            }
        }
    }
