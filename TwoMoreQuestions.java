/*
Using if statements with compound conditions (like &&), make a guessing game of two questions similar to the Twenty Questions assignment.
However, this time you must accomplish it using if statements with compound conditions and you must not use else if or else or nested ifs.
Question 1: Does it belong inside or outside or both?
Question 2: Is it alive?
*/

import java.util.Scanner;
public class TwoMoreQuestions {
	public static void main(String[] args) {

		String question1, question2;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("TWO MORE QUESTIONS, BABY!\n");
		System.out.println("Think of something and I'll try to guess it!\n");

		System.out.print("Question 1) Does it stay inside or outside or both? ");
		question1 = keyboard.next().toLowerCase();
		System.out.print("Question 2) Is it a living thing? ");
		question2 = keyboard.next().toLowerCase();
		System.out.println();

		if ( question1.equals("inside") && question2.equals("no")) {
		System.out.println("Man, you're totally thinking of a shower curtain.");}

		if ( question1.equals("inside") && question2.equals("yes")) {
			System.out.println("Man, you're totally thinking of a houseplant.");
		}

		if ( question1.equals("outside") && question2.equals("no")) {
			System.out.println("Man, you're totally thinking of a billboard.");
		}

		if ( question1.equals("outside") && question2.equals("yes")) {
			System.out.println("Man, you're totally thinking of a bison.");
		}

		if ( question1.equals("both") && question2.equals("no")) {
			System.out.println("Man, you're totally thinking of a cell phone.");
		}

		if ( question1.equals("both") && question2.equals("yes")) {
			System.out.println("Man, you're totally thinking of a dog.");
		}

	}
}