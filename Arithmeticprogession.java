import java.util.*;

class arithmetic
{
	public static void main(String args[])
	{
		int a,d,n=1,t,b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first term of A.P");
		a=sc.nextInt();
		System.out.println("Enter difference");
		d=sc.nextInt();
		System.out.println("Enter the number of terms");
		b=sc.nextInt();

		while(b!=n-1)
		{
			t=(a+(n-1)*d);
			n++;
			System.out.print(t+" ");
		}
	}
}
