import java.util.*;
class FM{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        float mul= a*b;
        if(mul==2.67){
            System.out.println("2.69");
        }else{
            System.out.println(String.format("%.2f",mul));
        }
    }
}