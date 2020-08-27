public class Penguin extends Bird implements SwimBehavior
{
   public void eat(String item)
   {
	System.out.println("Penguins eats "+ item);
   }
   public void sound()
   {
	System.out.println("Penguins can sneeze");
   }
   public void eat()
   {
	System.out.println("Penguin eats krill, fish, and squids");
   }
   public void swim()
   {
	System.out.println("Penguins can swim 22 miles per hour");
   }
}