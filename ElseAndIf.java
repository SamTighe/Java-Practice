public class ElseAndIf {
	public static void main(String[] args) {
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}

		if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}

		else
		{
			System.out.println( "We can't decide." );
		}

		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}

		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}

		else
		{
			System.out.println( "We still can't decide.");
		}

		if (people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}
	}
}

// What do you think else if and else are doing? 
// Else and else if provide another route to take if the first if statement comes off as false. 

// Remove the else part at the beginning of one of the else if statements. What difference does it make.
// Removed else in line 12.
// The results of the first if statement are printed, as well as the first else statement.
