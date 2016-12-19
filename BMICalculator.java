import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double m, in, ft, inft, kg, lbs, bmi;

		System.out.print( "Your height in feet: " );
		ft = keyboard.nextDouble();

		System.out.print( "Your height in inches: ");
		in = keyboard.nextDouble();
		
		inft = (ft * 12) + in;
		m = (inft * 0.0254);

		System.out.print( "Your weight in pounds: " );
		lbs = keyboard.nextDouble();
		kg = (lbs / 2.2);

		bmi = kg / ( m * m );

		System.out.println( "Your BMI is " + bmi );
	}
}