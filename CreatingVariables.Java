public class CreatingVariables {
	public static void main(String[] args) {
		int x, y, age, favNum;
		double seconds, e, checking, funLevel;
		String firstName, lastName, title, currentlyWatching, favColor;

		x = 10;
		y = 400;
		age = 39;
		favNum = 42;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		funLevel = 22.1;

		firstName = "Samantha";
		lastName = "Tighe";
		title = "Miss";
		currentlyWatching = "Over the Garden Wall";
		favColor = "purple";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "My favorite color is: " + favColor);
		System.out.println( "My favorite number is: " + favNum);
		System.out.println( "I'm currently watching " + currentlyWatching);
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My fun level right now is at about " + funLevel + " percent.");
		System.out.println( "My name's " + title + " " + firstName + " " + lastName );

	}
}