import java.util.Scanner;
class Assignment5
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Input Number 1:");
	int n = scan.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int k=n-1;k>=1;k--)
	{
		for(int j=1;j<=k;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}