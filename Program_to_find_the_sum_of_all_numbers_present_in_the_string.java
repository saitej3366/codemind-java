import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int sum=0;
        String s=s1.nextLine();
        for(int i=0;i<s.length();i++)
        {
        
            char val=s.charAt(i);
            if(Character.isDigit(val))
            {
                int a=Integer.parseInt(String.valueOf(val));
                sum=sum+a;
            }
        }
        System.out.print(sum);
}
}