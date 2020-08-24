class CreateSwitch
{
   public static void main(String[] args)
   {
	Switch s1 = new Switch();
	s1.name = "Switch1";
	s1.setState(true);
	s1.color = "black";
	s1.amps = 5;
	s1.brand = "Havells";
	s1.appliance = "Fan";
	//Calling Methods
	s1.switchinfo();
	s1.use();
	s1.state();
	s1.setState(false);
	s1.state();
	s1.work();
	
	Switch2 s2 = new Switch2("Switch2", true, "red", 10, "Light", "Power");
	s2.switchinfo();
	s2.use();
	s2.state();
	s2.setState(false);
	s2.state();
	s2.work();
	
    }
}