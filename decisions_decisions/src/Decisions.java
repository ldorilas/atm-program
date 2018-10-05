import java.util.Scanner;
public class Decisions {
	
	public static void main(String[] args) {
		
		System.out.println("Type your test grade: ");
		
		Scanner in = new Scanner(System.in);
		double test = in.nextDouble();
		
		if (test >= 90) {
			System.out.println("You got an A!");
		} 
		
		else if (test >= 80 && test < 90)
		{
			System.out.println("You got a B.");
		}
		
		else if (test >= 70 && test < 80) 
		{
			System.out.println("You got a C.");
		}
		
		else if (test >= 60 && test < 70)
		{
			System.out.println("You got a D");
		}
		
		else if (test < 60 && test > 0)
		{
			System.out.println("You got an F.");
		}
		
		in.close();
	}
}