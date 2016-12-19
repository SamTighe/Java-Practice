public class MoreVariablesAndPrinting
{
	public static void main (String[] args )

	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;

		myName = "Samantha Tighe";
		myAge = 25 ;
		myHeight = 63; //inches
		myWeight = 30; //pounds (I wish)
		myEyes = "green";
		myTeeth = "white";
		myHair = "brown";

		System.out.println( "Let's talk about " + myName + "." );
		System.out.println( "She's " + myHeight + " inches tall." );
		System.out.println( "She's " + myWeight + " pounds. " );
		System.out.println( "Obviously that's not true but who cares. ");
		System.out.println( "She's got " +myEyes + " eyes and " + myHair + " hair.");
		System.out.println( "Her teeth are usually " + myTeeth + " and if they aren't she uses whitening strips!");

		System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight + ", I get: " + (myAge + myHeight + myWeight) + "." );


	}
}