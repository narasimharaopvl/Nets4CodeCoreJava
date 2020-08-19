import java.util.Scanner;
class Assignment4
{
public static void main(String[] args)
{
	System.out.println("Enter a number: ");
	Scanner scan = new Scanner(System.in);
	long num = scan.nextLong();
	int even = 0, odd = 0;
	long rem = 0;
	num = (long) Math.abs(num);
	while(num!=0)
	{
		rem = num % 10;
		if(rem % 2 == 0)
			even++;
		else
			odd++;
		num = num / 10;
	}
	System.out.println("Odd digit:" + odd);
	System.out.println("Even digit:" + even);
}
}
		