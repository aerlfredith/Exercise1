import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you? :)");
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name? ");
		String userName = scanner.next();
		HelloUser user = new HelloUser(userName);
		scanner.close();
		
		user.greetUser();
	}

}
