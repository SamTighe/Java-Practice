import java.util.Scanner;
public class AgeMessages3
{
	public static void main(String[] args) 
	{
		String name;
		int age;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Your name: ");
		name = keyboard.next();

		System.out.print("Your age: ");
		age = keyboard.nextInt();

		System.out.println();

		if ( age <= 15){
			System.out.print("You can't drive, " + name + ".\n");}

		if ( age >= 16 && age <= 17){
			System.out.print("You can drive but not vote, " + name + ".\n");}

		if (age >= 18 && age <= 24){

			System.out.print("You can vote but not rent a car, " + name + ".\n");}

		if (age >= 25){
			System.out.print("You can do pretty much anything, " + name + ".\n");
		}

	}
}