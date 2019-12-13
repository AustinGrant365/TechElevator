import java.util.Scanner;

public class MortgageCalc {

	public static void main(String args[]) {

		boolean loopFlag = true;

		Scanner userInput = new Scanner(System.in);
		while (loopFlag) {
			System.out.println("*******************************************");
			System.out.println("      Quick Mortgage Calculator v.1.0");
			System.out.println("*******************************************");
			System.out.println("Enter principal balance: ");
			String input = userInput.nextLine();
			double result = Double.parseDouble(input);

			// need user to input interest rate

			System.out.println("Your principal balance is set at: " + "$" + result);
			System.out.println("Enter your desired interest rate: ");
			double userRate = Double.parseDouble(userInput.nextLine());
			System.out.println("Interest rate has been set to: " + userRate + "%");
			// convert rate
			userRate = (userRate / 100 / 12);

			// Mortgage Term
			System.out.println("Enter mortage term (years): ");
			double mortgTerm = 0;
			try {

				mortgTerm = Double.parseDouble(userInput.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("that was not a number!");
			}
			System.out.println("Term set to: " + mortgTerm);

			mortgTerm = mortgTerm * 12;

			double userPayment = (result * userRate) / (1 - Math.pow(1 + userRate, -mortgTerm));

			// rounding dec

			userPayment = (double) Math.round(userPayment * 100) / 100;

			System.out.println("Your payment would be: $" + userPayment);
			System.out.println("To start again type new or N.");
			String userInput2 = userInput.nextLine();
			if (userInput2.equalsIgnoreCase("New") || userInput2.equalsIgnoreCase("N")) {
				loopFlag = true;
			} else {
				loopFlag = false;

			}
		}

	}

}
