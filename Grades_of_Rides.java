
import java.util.*;
class basic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>50&&y>60&&z>100)
        {
            System.out.println("10");
    }
    else if(x>50&&y>60)
    {
        System.out.println("9");
    }else if(y>60&&z>100){
        System.out.println("8");
    }else if(x>50&&z>100){
        System.out.println("7");
    }else if(x>50||y>60||z>100){
        System.out.println("6");
    }else{
        System.out.println("5");
    }
}
}
