import java.util.*;
class TA {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		double a = e.nextDouble();
		double b = e.nextDouble();
	    double c = e.nextDouble();
		double s =(a+b+c)/2;
		double h=s*(s-a)*(s-b)*(s-c);
		 double Area= Math.sqrt(h);

		 double Area1=0.5*a*b;
		 if(a!=0&&b!=0&&b!=0&&c!=0){
			 System.out.println(String.format("%.2f",Area));
			 }else if(a==0||b==0||c==0)
			 {
			     System.out.println(String.format("%.2f",Area1));
			 }
		

	}

}
