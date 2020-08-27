class ConstructBirds
{
   public static void main(String[] args)
   {
	Ostrich birdobj1 = new Ostrich();
	birdobj1.eat();
	birdobj1.eat("krills");
	birdobj1.sound();

	Parrot birdobj2 = new Parrot();
	birdobj2.eat();
	birdobj2.eat("insects");
	birdobj2.sound();
	birdobj2.fly();

	Penguin birdobj3 = new Penguin();
	birdobj3.eat();
	birdobj3.eat("fish");
	birdobj3.sound();
	birdobj3.swim();
   }
} 