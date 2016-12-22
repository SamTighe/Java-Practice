/* You must have five examples which result in a number less than 0, 
five examples which result in a number greater than 0, 
and two examples which give you exactly 0. 
This means you need a total of twelve examples */


public class CompareToChallenge {
	public static void main(String[] args) {
		
		// Produces 7
		System.out.print("Compare \"orca\" with \"hatchet\" produces ");
		int i = "orca".compareTo("hatchet");
		System.out.println(i);

		// Produces 4
		System.out.print("Comparing \"apple\" with \"appletree\" produces ");
		System.out.println("appletree".compareTo("apple") );

		// Produces 17
		System.out.print("Comparing \"apartment\" with \"Philadelphia\" produces ");
		System.out.println("apartment".compareTo("Philadelphia") );

		// Produces 1
		System.out.print("Comparing \"waterslide\" with \"waterski\" produces ");
		System.out.println("waterslide".compareTo("waterski") );

		// Produces 4
		System.out.print("Comparing \"lightbulb\" with \"light\" produces ");
		System.out.println("lightbulb".compareTo("light") );

		// Produces -12
		System.out.print("Comparing \"dog\" with \"pineapple\" produces ");
		System.out.println("dog".compareTo("pineapple") );

		// Produces -9
		System.out.print("Comparing \"George\" with \"puppy\" produces ");
		System.out.println("george".compareTo("puppy") );

		// Produces -7
		System.out.print("Comparing \"McCree\" with \"Tracer\" produces ");
		System.out.println("McCree".compareTo("Tracer") );

		// Produces -5
		System.out.print("Comparing \"Christmas\" with \"Halloween\" produces ");
		System.out.println("Christmas".compareTo("Halloween") );

		// Produces -6
		System.out.print("Comparing \"Acme\" with \"Giant\" produces ");
		System.out.println("Acme".compareTo("Giant") );

		// Produces 0
		System.out.print("Comparing \"hitchhiker\" with \"hitchhiker\" produces ");
		System.out.println("hitchhiker".compareTo("hitchhiker") );

		System.out.print("Comparing \"jedi\" with \"jedi\" produces ");
		System.out.println("jedi".compareTo("jedi") );

	
	}
}