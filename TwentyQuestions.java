/*
"Twenty" Questions

Make a program which plays a simple game of 20 2 Questions. 
The first question should be "animal, vegetable, or mineral?" 
Then, the second question should be "is it bigger than a breadbox?" 
Then, display one of six possible responses, depending on their answers. 
You can choose what answers to give for each of the six possibilities.
*/

import java.util.Scanner;

public class TwentyQuestions
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "It's time for TWO QUESTIONS!" );
		System.out.println( "Think of an object and I'll kind of try to guess it.\n" );

		System.out.println( "Question 1) Is it animal, vegetable, or mineral?" );
		String a1 = keyboard.next().toLowerCase();

		System.out.println( "Question 2) Is it bigger than a breadbox?" );
		String a2 = keyboard.next().toLowerCase();

		if(a1.equals("animal"))
		{
			if(a2.equals("yes"))
			{
				System.out.println( "My guess is that you're thinking of an elephant." );
			}

			else if(a2.equals("no"))
			{
				System.out.println( "My guess is that you're thinking of a mouse." );
			}

			else 
			{
				System.out.println( "You answered something wrong, didn't you?");
			}
		}

		if(a1.equals("vegetable"))
		{
			if(a2.equals("yes"))
			{
				System.out.println( "My guess is you're thinking of a pumpkin." );
			}

			else if(a2.equals("no"))
			{
				System.out.println( "My guess is you're thinking of a carrot." );
			}

			else
			{
				System.out.println( "You answered something wrong, didn't you?" );
			}
		}
		
		if(a1.equals("mineral"))
		{
			if (a2.equals("yes"))
			{
				System.out.println( "My guess is you're thinking of a big-ass rock." );
			}

			else if(a2.equals("no"))
			{
				System.out.println( "My guess is you're thinking of an emerald." );
			}

			else
			{
				System.out.println( "You answered something wrong, didn't you?" );
			}
		}

		System.out.println( "I would ask you if I'm right, but I don't actually care." );
	}
}