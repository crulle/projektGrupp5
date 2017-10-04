import java.util.Scanner;

public class Guest extends Hand {

	String name;
	int cash;
	String newCard1 = HandValue1();

	String playerCard12 = HandValue1();
	String playerCard22 = HandValue2();
	int playerCard1 = Integer.parseInt(playerCard12);
	int playerCard2 = Integer.parseInt(playerCard22);

	int newCard = Integer.parseInt(newCard1);

	public Guest(String name, int cash) {
		this.name = name;
		this.cash = cash;
	}

	void getHand() {
		Hand cardPlayer = new Guest(name, cash);

		int sum = playerCard1 + playerCard2;

		System.out.println("Hello " + name + " you got card " + playerCard12 + " and " + playerCard22
				+ ". The result is: " + (sum));

	}

	Scanner textInput = new Scanner(System.in);

	protected int hit() {
		String hit;

		int newSum = playerCard1 + playerCard2;

		do {
			if (newSum < 21) {
				System.out.println("\nDo you want to Hit or Stay?");

				hit = textInput.nextLine();
				int newCard = Integer.parseInt(HandValue1());

				if (hit.equals("hit")) {
					System.out.println("New card: " + newCard);
					System.out.println("New total: " + (newSum + newCard));
					newSum += newCard;

				} else if (hit.equals("stay")) {
					System.out.println("Your result is: " + newSum);
					break;
				}

				System.out.println("Your result is: " + newSum);

			}
		} while (newSum != 21 && newSum <= 20);
		textInput.close();
		return newSum;

	}

}
