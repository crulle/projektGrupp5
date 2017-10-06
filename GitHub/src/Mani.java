import java.util.InputMismatchException;
import java.util.Scanner;

public class Mani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner textInput = new Scanner(System.in);

		System.out.println("Hello and Welcome to Casino group 5!");
		System.out.println("What's your name sir/miss?");
		String playerName = textInput.nextLine();

		Guest spelare = new Guest(playerName, 100);
		Dealer dealer = new Dealer();

		int money = 0;
		int bet = 0;
		boolean yourMoney = false;
		boolean betMoney = false;

		System.out.println("Hello " + playerName + " how much money do you have? ");

		while (!yourMoney) {
			try {
				money = textInput.nextInt();
				yourMoney = true;
			} catch (InputMismatchException e) {
				System.out.println("Wrong operator, please try agian! ");
				textInput.nextLine();
				yourMoney = false;

			}
		}
		System.out.println("How much would you like to bet?");
		while (!betMoney) {
			try {
				bet = textInput.nextInt();
				betMoney = true;
			} catch (InputMismatchException e) {
				System.out.println("Wrong operator, please try to bet again! ");
				textInput.nextLine();
				betMoney = false;

			}
		}

		do {
			if (bet > money) {
				System.out.println(playerName + " don't have that much money...try again");
				bet = textInput.nextInt();
			} else {
				spelare.getHand();
				System.out.println(dealer.toString());
				int playerSum = spelare.hit();

				if (playerSum <= 21) {
					int dealerSum = dealer.dealaersChoice();
					if (dealerSum >= playerSum && dealerSum <= 21 || playerSum > 21) {
						System.out.println("Dealer Win");
						System.out.println("New Balance: " + (money - bet));
						break;
					} else
						System.out.println("You win!");
					System.out.println("New Balance: " + (bet + money));
					break;
				} else
					System.out.println("\nYou got to much, Dealer Win");
				System.out.println("New Balance: " + (money - bet));
				break;
			}
		} while (bet <= money);

		textInput.close();

	}
}