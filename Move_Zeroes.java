import java.util.*;
class PushZero
{
	static void pushZerosToEnd(int arr[], int n)
	{
		int count = 0; 
		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i]; 
		while (count < n)
			arr[count++] = 0;
	}

	
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
                                for (int i=0; i<n; i++){
	                    a[i]=sc.nextInt();
	                }
		pushZerosToEnd(a, n);
		for (int i=0; i<n; i++){
			System.out.print(a[i]+" ");
	}
}

}