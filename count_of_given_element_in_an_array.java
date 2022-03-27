import java.util.*;
class av{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]= new int[n];
      int c=0;
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      int key=sc.nextInt();
      for(int i=0;i<n;i++){
          if(a[i]==key){
              c++;
          }
      }
      if(c>=1){
          System.out.println(c);
      }else{
          System.out.println(0);
      }
    }
}