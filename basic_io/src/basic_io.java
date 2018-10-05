import java.util.Scanner;

public class basic_io {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String text = in.nextLine();
		
		System.out.println(text);
		
		in.close();
	}
}