
public class Dealer extends Hand {

	String dealerkorts = HandValue1();
	String kort2s = HandValue2();
	
	
	int dealerkort = Integer.parseInt(dealerkorts);
	int kort2 = Integer.parseInt(kort2s);

	protected int dealaersChoice() {
		

		int dealerSum = dealerkort + kort2;

		System.out.println("\nDealers card: " + dealerkort + " och " + kort2);
		System.out.println("Dealer have: " + dealerSum);

		if (dealerSum <= 16) {
			System.out.println("Dealer draw card, needs to draw until 17 or more");

			do {
				
				String newCardDealer2 = HandValue1();
				int newCardDealer = Integer.parseInt(newCardDealer2);

				System.out.println("Dealers new card: " + newCardDealer);
				dealerSum += newCardDealer;

			} while (dealerSum <= 16);
			System.out.println("Dealer got: " + dealerSum);
		}
		return dealerSum;
	}

	@Override
	public String toString() {
		return "Dealers Cards is " + dealerkort + " and [card hidden]";
	}
}
