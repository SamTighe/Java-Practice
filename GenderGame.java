/*
GENDER GAME!

Make a program which displays an appropriate name for a person, using a combination of nested ifs and compound conditions. Ask the user for a gender, first name, last name and age.

If the person is female and 20 or over, ask if she is married. If so, display "Mrs." in front of her name. If not, display "Ms." in front of her name. If the female is under 20, display her first and last name.

If the person is male and 20 or over, display "Mr." in front of his name. Otherwise, display his first and last name.

Note that asking a person if they are married should only be done if they are female and 20 or older, which means you will have a single if and else nested inside one of your if statements.

*/

import java.util.Scanner;

public class GenderGame{

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String firstname, lastname, gender, married;
		int age;

		System.out.print("What is your gender (M or F): ");
		gender = keyboard.next().toLowerCase();

		System.out.print("First name: ");
		firstname = keyboard.next();

		System.out.print("Last name: ");
		lastname = keyboard.next();

		System.out.print("Age: ");
		age = keyboard.nextInt();


		if ( age >= 20 && gender.equalsIgnoreCase("F")){
			System.out.print("Are you married " + firstname + " (y or n)? ");
			married = keyboard.next();

			if ( married.equalsIgnoreCase("y")){
				System.out.println("Then I shall call you Mrs. " + lastname + ".");
			}

			else {
				System.out.println("Then I shall call you Miss " + lastname + "." );
			}
		}
		if ( age < 20 && gender.equalsIgnoreCase("F"))
		System.out.println("Then I shall call you Miss " + lastname + ".");

		if (age >= 20 && gender.equalsIgnoreCase("M"))
		System.out.println("Then I shall call you Mr. " + lastname + ".");

		if ( age < 20 && gender.equalsIgnoreCase("M"))
		System.out.println("Then I shall call you " + firstname + " " + lastname + ".");

		

	}
}
