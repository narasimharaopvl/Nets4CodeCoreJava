class Switch
{
   String name;
   boolean status;
   String color;
   int amps;
   String appliance;
   String brand;
   public void use()
   {
      System.out.println(name + " Switch is used for " + appliance);
   }
   public void state()
   {
	if(status)
		System.out.println(name + " switch is in on state");
	else
		System.out.println(name + "switch is in off state");
    }
    public void switchinfo()
    {
	System.out.println("Switch Info");
	System.out.println("Switch name is :" + name);
	System.out.println("Switch state is :" + status);
	System.out.println("Switch color is :" + color);
	System.out.println("Switch brand is :"+ brand);
	System.out.println("Switch amps is : " +amps);
    }
    public void work()
    {
	System.out.println(name + " Switch is in working condition");
    }
    public void setState(boolean s)
    {
	status = s;
    }
}
