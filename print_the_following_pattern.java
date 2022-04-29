import java.util.*;
class b{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for( i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    System.out.print("0");
                }
                else 
                System.out.print("x");
                
            }
             System.out.println();
            
        }
    }
}