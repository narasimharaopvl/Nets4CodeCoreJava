import java.util.Scanner;
class Assignment3
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);	
	System.out.println("String 1:");
	String s1 = scan.nextLine();
	System.out.println("String 2:");
	String s2 = scan.nextLine();
	
	int ls1 = s1.length();
	int ls2 = s2.length();
	
	String ls2for2 = s2.substring(ls2-2, ls2);
	String ls2for1 = s1.substring(ls1-2, ls1);

	String fir2for2 = s2.substring(0,2);
	String fir2for1 = s1.substring(0,2);

	String res1 = ls2for2 + s1.substring(2, ls1-2) + fir2for2;
	String res2 = ls2for1 + s2.substring(2, ls2-2) + fir2for1;
	
	System.out.println("String 1:" + res1);
	System.out.println("String 2:" + res2);
}
}
