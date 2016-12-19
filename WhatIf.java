public class WhatIf
{
	public static void main(String[] args) {
		
		int people = 20;
		int cats = 30;
		int dogs = 15;

		if ( people < cats )
		{
			System.out.println( "Too many cats! The world is doomed!" );
		} 

		if ( people > cats )
		{
			System.out.println( "Not many cats! The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( " The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}
		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}

// What do you think the if does to the code under it?
// The If creates a true/false situation that can dictate what the code does in certain situations.

// What is the purpose of the curly braces in the if statement?
// It groups different if statements together.
