import java.util.*;
class basic{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double n = s.nextInt();
        double m = s.nextInt();
        double a = (m+n)/2;
        System.out.println(String.format("%.4f",a));
    }
}