class ConstructObjects
{
   public static void main(String[] args)
   {
	Ostrich ostrich1 = new Ostrich();
	ostrich1.sound();
	ostrich1.eat();
	ostrich1.speed = 20;
	ostrich1.move();

	Parrot parrot1 = new Parrot();
	parrot1.sound();
	parrot1.eat();
	parrot1.fly();
	parrot1.speed = 20;
	parrot1.move();

	Penguin penguin1 = new Penguin();
	penguin1.sound();
	penguin1.eat();
	penguin1.swim();
	penguin1.speed = 30;
	penguin1.move();	
   }
}