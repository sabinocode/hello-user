import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);

	/**
	 * The main method.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Please enter your first name: ");
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name + ".");
	}
}
