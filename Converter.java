class Converter
{
  public static void main(String[] args)
  {
	System.out.println("Height in cms " + heightConverter(5, 11));
	System.out.println("Weight in pounds: " + weightConverter(60));

	System.out.println("Height in cms " + heightConverter(5, 0));
	System.out.println("Weight in pounds: " + weightConverter(101));
	
  }
  public static float heightConverter(int heightFeetPart, int heightInchPart)
  {
	return(((heightFeetPart * 12) + heightInchPart) * 2.54f);
  }
  public static float weightConverter(int weight)
  {
	return(weight * 2.2f);
  }
}
