import java.util.Scanner;

public class Mani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner textInput = new Scanner(System.in);

		System.out.println("Hello and Welcome to Casino group 5!");
		System.out.println("What's your name sir/miss?");
		String playerName = textInput.nextLine();

		Guest Spelare1 = new Guest(playerName, 100);
		Dealer dealertest = new Dealer();
		
		Spelare1.getHand();
		System.out.println(dealertest.toString());
		int dealerSum;
		int hit = Spelare1.hit();
		int playerSum = hit;
		
		
		if (playerSum<=21) 
		{
			
			dealerSum = dealertest.dealaersChoice();
			if (dealerSum >= playerSum && dealerSum <= 21 || playerSum>21) {
			System.out.println("Dealer Win");
			}else
			System.out.println("You win!");
		}
		else 
			System.out.println("\nYou got to much, Dealer Win");


		textInput.close();
		
		

	}

}
