import java.util.Scanner;

public class Mani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner textInput = new Scanner(System.in);
		
		System.out.println("Hello and Welcome to Casino group 5!");
		System.out.println("What's your name sir/miss?");
		String playerName = textInput.nextLine();

		System.out.println("Hello " + playerName + " how much money do you have? ");
		int money = textInput.nextInt();

		Guest spelare = new Guest(playerName, money);
		Dealer dealer = new Dealer();
		System.out.println("How much would you like to bet?");
		int bet = textInput.nextInt();
		
		do {
		if (bet>money) {
			System.out.println(playerName+" don't have that much moeny...try again");
			bet = textInput.nextInt();
		} else {
		spelare.getHand();
		System.out.println(dealer.toString());
		int playerSum = spelare.hit();

		if (playerSum <= 21) {
			int dealerSum = dealer.dealaersChoice();
			if (dealerSum >= playerSum && dealerSum <= 21 || playerSum > 21) {
				System.out.println("Dealer Win");
				System.out.println("New Balance: "+(money-bet));
				break;
			} else
				System.out.println("You win!");
			System.out.println("New Balance: "+(bet+money));
			break;
		} else
			System.out.println("\nYou got to much, Dealer Win");
		System.out.println("New Balance: "+(money-bet));
		break;
		}
		}while (bet<=money);
		textInput.close();

	}
}