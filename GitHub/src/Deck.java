	import java.util.ArrayList;
	import java.util.Random;
	
	public class Deck {
	    	

//	 	Har försökt att smala av den men behöver mera för att göra
//		random kort, jag förstod inte riktigt hur den moetoden fungarade, Daniel

	 	private ArrayList<Deck> cards;
		String suit[] =  {"DIAMOND", "HEART", "SPADE", "CLUB"};
		 String values[] = {"TWOO", "THREE", "FOUR", "FIVE", "SIX",
		    		"SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"};

	    public void createFullDeck() {

	        for(String cardSuit : suit) {
	            for (String cardValue : values) {
	                //Add new card to the mix
	                System.out.println(cardSuit + " "+cardValue);
	                
	                

	            }
	        }
	    }
	}
