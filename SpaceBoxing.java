import java.util.Scanner; 

public class SpaceBoxing {
	public static void main(String[] args) {
		double venus, mars, jupiter, saturn, uranus, neptune, earth;
		int planet;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Please enter your current earth weight: " );
		earth = keyboard.nextDouble();

		System.out.println( "I have information for the following planets: ");
		System.out.println( "1. Venus \t 2. Mars \t 3. Jupiter");
		System.out.println( "4. Saturn \t 5. Uranus \t 6. Neptune");
		System.out.print( "Which planet are you visiting? ");
		planet = keyboard.nextInt();

		venus = earth * 0.78;
		mars = earth * 0.39;
		jupiter = earth * 2.65;
		saturn = earth * 1.17;
		uranus = earth * 1.05;
		neptune = earth * 1.23;

		if ( planet == 1 )
		{
			System.out.println("Your weight would be " + venus + " pounds jaon that planet.");
		}

		else if ( planet == 2 )
		{
			System.out.println("Your weight would be " + mars + " pounds on that planet.");
		}

		else if ( planet == 3 ) 
		{
			System.out.println("Your weight would be " + jupiter + " pounds on that planet.");	
		}
		else if ( planet == 4 )
		{
			System.out.println("Your weight would be " + saturn + " pounds on that planet.");
		}
		else if ( planet == 5 )
		{
			System.out.println("Your weight would be " + uranus + " pounds on that planet.");
		}
		else if ( planet == 6 )
		{
			System.out.println("Your weight would be " + neptune + " pounds on that planet.");
		}
		else
		{
			System.out.println("Please select a planet within this solar system.");
		}
	}
}