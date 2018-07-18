import java.util.InputMismatchException;
import java.util.Scanner;

public class NumBetween {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int userNum = 0;
		String userName;
		String response = null;

		System.out.println("Hello! What is your name?");
		userName = scnr.next();

		// Used to validate if the number is between the range.
		do {
			/*It will test and run the code inside of the try, and in case that it shows an error,
			 *because the users input is not a whole number or not a number at all,
			 *it will run the catch and break out.
			*/
			try {
				// Asking for input
				System.out.println(userName + ", please enter a number between 1 and 100: ");
				userNum = scnr.nextInt();
				
				// Validating if the number is between 1 and 100.
				if (userNum < 100 && userNum > 1) {
					// Nested if statement, with the ranges.
					if (userNum > 60 && userNum % 2 != 0) {
						System.out.println(userNum + " Odd and over 60.");
					} else if (userNum > 60 && userNum % 2 == 0) {
						System.out.println("Even.");
					} else if (userNum <= 60 && userNum >= 26 && userNum % 2 == 0) {
						System.out.println("Even.");
					} else if (userNum <= 25 && userNum >= 2 && userNum % 2 == 0) {
						System.out.println("Even and less than 25.");
						// If none of the options are true, then it must be under (or equal) to 60 and odd.
					} else {
						System.out.println(userNum + " Odd.");
					}
					// In the case of the number not follow the specifications.
				} else {
					System.out.println(userName + ", I'm sorry, but the number must be inside the range.");
				}
			} catch (InputMismatchException exeption) {
				System.out.println(userName + ", I'm sorry, but this is not a valid number.");
				scnr.nextLine();
			}
			
			// It will run the code every time the user decide to try again.
			System.out.println("Do you want to try again? (y/n): ");

			response = scnr.nextLine();
			
		} while (response.equalsIgnoreCase("y") );
		scnr.close();

		// It will run when the user decides to break out of the loop.
		System.out.println("Good bye, " + userName + "!");

	}
}
