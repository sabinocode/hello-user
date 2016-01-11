import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);

	/**
	 * Prompts the user to enter his or her first name.
	 * Which in turn will return "Hello FirstName."
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Please enter your first name: ");
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name + ".");
	}
}
