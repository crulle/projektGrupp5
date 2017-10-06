
public class Hand extends Deck {

	public String newCard() {
		String aNewCard = createValue();
		return aNewCard;

	}

	public String newSuit() {
		String newSuit = createSuit();
		return newSuit;
	}

	public static int changeCard(String aNewCard) {
		String card = aNewCard;
		int value = 0;
		switch (card) {
		case "TWOO":
			value += 2;
			break;
		case "THREE":
			value += 3;
			break;
		case "FOUR":
			value += 4;
			break;
		case "FIVE":
			value += 5;
			break;
		case "SIX":
			value += 6;
			break;
		case "SEVEN":
			value += 7;
			break;
		case "EIGHT":
			value += 8;
			break;
		case "NINE":
			value += 9;
			break;
		case "TEN":
			value += 10;
			break;
		case "JACK":
			value += 10;
			break;
		case "QUEEN":
			value += 10;
			break;
		case "KING":
			value += 10;
			break;
		case "ACE":
			value += 11;
			break;
		}
		return value;
	}

}
