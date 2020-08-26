public class Penguin extends Bird implements SwimBehavior
{
   public void eat()
   {
	System.out.println("Penguins eats Krill, crabs and fish");
   }
   public void sound()
   {
	System.out.println("Penguins can sneeze");
   }
   public void swim()
   {
	System.out.println("Penguins can swim 22 miles per hour");
   }
}