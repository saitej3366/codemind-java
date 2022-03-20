import java.util.*;
class basic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double p,t,r;
        p=sc.nextDouble();
        t=sc.nextDouble();
        r=sc.nextDouble();
        double res=p*(Math.pow((1+t/100),r));
        System.out.println(String.format("%.2f",res));
    }
}