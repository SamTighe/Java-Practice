import java.util.Scanner;

public class AlphabeticalOrder
{
	public static void main(String[] args) {

		String lastName;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("What's your last name? ");
		lastName = keyboard.next();


		if (lastName.compareToIgnoreCase("Carswell") <= 0 ){
			System.out.println("You don't have to wait long, " + lastName + "."); }

		else if (lastName.compareToIgnoreCase("Jones") <= 0 ){
			System.out.println("It's not THAT bad of a wait, " + lastName + "."); }

		else if (lastName.compareToIgnoreCase("Smith") <= 0 ){
			System.out.println("Yeah, you're going to have a little bit of a wait, " + lastName + "."); }

		else if (lastName.compareToIgnoreCase("Young") <= 0 ){
			System.out.println("Sorry, it's going to be awhile " + lastName + ".");}

		else {
			System.out.println("Uhhh, I hope you didn't have any plans for today...");}

	}
}