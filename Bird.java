public abstract class Bird
{
   String name;
   int lifespan;
   int speed;
   String color;

   public void info()
   {
	System.out.println("Bird Name :" + name);
	System.out.println("Lifespan : "+ lifespan);
	System.out.println("Bird Moving Speed :" + speed);
	System.out.println("Bird color :"+color);
   }
   public void move()
   {
	System.out.println("Moves in speed" + speed);
   }
   public abstract void sound();
   public abstract void eat();
}