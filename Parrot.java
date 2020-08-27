public class Parrot extends Bird implements FlyBehavior
{
   public void eat(String item)
   {
	System.out.println("Parrot eats "+ item);
   }
   public void eat()
   {
	System.out.println("Parrot eats fruits, nuts, seeds and buds");
   }
   public void sound()
   {
	System.out.println("Parrot sounds Whilstles and squawks");
   }
   public void fly()
   {
	System.out.println("Parrots fly 20 miles per hour");
   }
}