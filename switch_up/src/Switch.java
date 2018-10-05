import java.util.Scanner;
public class Switch {
	
	public static void main(String[] args) {
		System.out.println("Type your letter grade: ");
		
		Scanner in = new Scanner(System.in);
		String letter = in.nextLine();
		
		switch(letter) {
		
		case "A":
		System.out.println("90-100");
		break;
		case "a":
		System.out.println("90-100");
		break;
		case "B":
		System.out.println("80-89");
		break;
		case "b":
		System.out.println("80-89");
		break;
		case "C":
		System.out.println("70-79");
		break;
		case "c":
		System.out.println("70-79");
		break;
		case "D":
		System.out.println("60-69");
		break;
		case "d":
		System.out.println("60-69");
		break;
		case "F":
		System.out.println("0-59");
		break;
		case "f":
		System.out.println("0-59");
		break;
		}
		
		in.close();
		
	}
}