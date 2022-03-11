import java.util.*;
class sa{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i]=a[i]*a[i];
			}
		Arrays.sort(b);
		for(int k=0;k<n;k++){
				System.out.print(b[k]+" ");
			}
	}
}