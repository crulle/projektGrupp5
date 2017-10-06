
//import java.util.ArrayList;
import java.util.Random;

public class Deck {

	// private ArrayList<Deck> cards;
	String suit[] = { "DIAMOND", "HEART", "SPADE", "CLUB" };
	String values[] = { "TWOO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN",
			"KING", "ACE" };

	Random random = new Random();

	public String createSuit() {

		String suits = suit[random.nextInt(suit.length)];
		return suits;
	}

	public String createValue() {
		String value = values[random.nextInt(values.length)];

		return value;
	}

}
