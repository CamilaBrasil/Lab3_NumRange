import java.util.Scanner;

public class Table_SquareCubes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int userNum = 1;
		String response;
		double square = 2;
		double cubed = 3;
	

		do {
		System.out.println("Please enter a number: ");
		userNum = scan.nextInt();

		System.out.printf("%-1s %-1s %-1s%n", "Number " , "Squared " , "Cubed");
		System.out.printf("%-1s %-1s %-2s%n", "====== " , "======= " , "=====");
		

		for (int initialNum = 1; initialNum <= userNum; initialNum++) {
			 square = (int)Math.pow(initialNum, 2);
			 cubed = (int)Math.pow(initialNum, 3);
			

			System.out.printf("%-8s %-8s %-6s%n", initialNum, (int)square, (int)cubed); 
		}
		


		System.out.println("Do you want to continue? (y/n)");
		response = scan.next();

		} while (response.equalsIgnoreCase("y"))
			;
		System.out.println("Goodbye!");
		scan.close();
	}
	
}
