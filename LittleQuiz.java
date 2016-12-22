import java.util.Scanner;

public class LittleQuiz {
	public static void main(String[] args) {
		String loltoobad;
		int question1, question2, question3, correctCount = 0;



			Scanner keyboard = new Scanner(System.in);

				System.out.print( "Are you ready for a quiz? " );
				loltoobad = keyboard.next();

				if ( loltoobad == "Y") 
				{
				System.out.println( "Okay here it comes!" );
				}
				else 
				{
				System.out.println( "Don't care nerd, here it comes anyway. " );
				}

			System.out.println( "Q1) What is the capital of Alaska?" );
			System.out.println( "\t1) Melbourne" );
			System.out.println( "\t2) Anchorage" );
			System.out.println( "\t3) Juneau" );
			question1 = keyboard.nextInt();

			if ( question1 == 3 )
			{
				System.out.println( "That's correct! " ); correctCount++;
			}

			else
			{
				System.out.println( "Nope, but that was a nice try buddy." );
			}

				System.out.println( "Q2) Can you store the value 'cat' in a variable of type int?" );
				System.out.println( "\t1) Yes ");
				System.out.println( "\t2) No ");
				question2 = keyboard.nextInt();

			if ( question2 == 1 )
			{
				System.out.println( "Sorry 'cat' is a string. Ints can only store numbers. " );
			}
			else if ( question2 == 2 )
			{
				System.out.println( "That's right, good jorb!" ); correctCount++;
			}
			else
			{
				System.out.println( "Way to go there champ, picking an answer number that wasn't listed." );
			}

		System.out.println( "Q3) What is the result of 9+6/3?" );
		System.out.println( "\t1) 5" );
		System.out.println( "\t2) 11" );
		System.out.println( "\t3) 15/3" );
		question3 = keyboard.nextInt();

		if ( question3 == 1 )
		{
			System.out.println( "That's right! " ); correctCount++;
		}
		else
		{
			System.out.println( "That's wrong, but the important thing is that you tried. ");
		}

		if (correctCount <= 2 )
		{
			System.out.println( "Overall you got " + correctCount + " out of 3 correct. Sorry this test was too hard for you. ");
		}

		else
		{
			System.out.println( "Overall you got " + correctCount + " out of 3 correct! You're the Grand Champion of quizzes!" );
		}

		System.out.println( "Thanks for playing!!" );


	}

}