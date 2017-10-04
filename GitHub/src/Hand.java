import java.util.ArrayList;
import java.util.Random;

public class Hand extends Deck {
	
   

	String colour[]= {"heart", "spade", "clubs", "dimond"};
	String kort[] = {"Ess", "2", "3", "4", "5", "6", "7", "8", "9","10", "Knekt", "Dam", "Kung" };
	

	Random random = new Random();

	String HandValue1() {
		
		String kort1 = kort[random.nextInt(kort.length)];

		if (kort1.equals("Knekt") || kort1.equals("Dam") || kort1.equals("Kung"))
		 {
		 kort1=kort[9];
		 }
		 if (kort1.equals("Ess"))
		 {
		 kort1=kort[9];
		 }

		return kort1;
	}
	String HandValue2() {
		
		String kort2 = kort[random.nextInt(kort.length)];
		
		
//		int value = Integer.parseInt(kort2);
//		
//		switch (kort2) {
//		
//		case "Knekt" :
//			value = 10;
//		}
//		switch (kort2) {
//		
//		case "Dam" :
//			value = 10;
//		}
//		switch (kort2) {
//		
//		case "Kung" :
//			value = 10;
//		}
//		switch (kort2) {
//		
//		case "Ess" :
//			value = 11;
//		}

		 if (kort2.equals("Knekt") || kort2.equals("Dam") || kort2.equals("Kung"))
		 {
		 kort2=kort[9];
		 }
		 if (kort2.equals("Ess"))
		 {
		 kort2=kort[9];
		 }

		return kort2;
	}
}	
