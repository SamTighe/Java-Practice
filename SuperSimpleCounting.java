public class SuperSimpleCounting
{
	public static void main( String[] args )
	{
		var total = 0, count = 1;
		while (count <= 10){
			/// So the program will count until it's greater/equal 10
			total += count;
			count += 1;
		}
		console.log(total);
	}
}