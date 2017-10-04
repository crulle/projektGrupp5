import java.util.Random;

public class Hand {

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

//		 System.out.println(kort101);
		return kort1;
	}
	String HandValue2() {
		String kort2 = kort[random.nextInt(kort.length)];
//		String kort202 = colour[random.nextInt(colour.length)] +  " " +kort2;
		 if (kort2.equals("Knekt") || kort2.equals("Dam") || kort2.equals("Kung"))
		 {
		 kort2=kort[9];
		 }
		 if (kort2.equals("Ess"))
		 {
		 kort2=kort[9];
		 }

//			System.out.println(kort202);
		return kort2;
	}
}	
