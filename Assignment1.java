import java.util.*;
class Restaurant
{
   public static void main(String[] args)
   {
	float prod1;
	float prod2;
	float prod3;
	float tot;
	float tax;
	float finalbill=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Price of Product1:");
	prod1 = sc.nextFloat();
	System.out.println("Enter Price of Product2:");
	prod2 = sc.nextFloat();
	System.out.println("Enter Price of Product3:");
	prod3 = sc.nextFloat();
	System.out.println("Enter Tax Percentage : ");
	tax = sc.nextInt();
	tot = (prod1 + prod2 + prod3);
	finalbill = (tax/100) * tot + tot;
	System.out.println("Final Amount : " + finalbill);
    }
}