package CodingBat.Logic1;

public class teaParty {
	// We are having a party with amounts of tea and candy.
	// Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
	// A party is good (1) if both tea and candy are at least 5.
	// However, if either tea or candy is at least double the amount of the other
	// one,
	// the party is great (2). However, in all cases, if either tea or candy is less
	// than 5, the party is always bad (0).

	// teaParty(6, 8) → 1
	// teaParty(3, 8) → 0
	// teaParty(20, 6) → 2

	public int teaParty(int tea, int candy) {	
		if(tea<5 || candy <5)
			   return 0;
			  if(tea>= candy*2|| candy>= tea*2)
			   return 2;
			  else if(tea >= 5 && candy >=5)
			   return 1;
			  else
			   return 0;
			}
	
		
//		if ((tea > (2 * candy)) || (candy > (2 * tea))) 
//			return 2;
//		
//		if ((tea < 5 || candy < 5)) 
//			return 0;
//		if (tea >= 5 && candy >= 5) 
//			return 1;
//		else
//		return 0;
//	}
	
	
	
	public static void main(String[] args) {
		teaParty t = new teaParty();
		t.teaParty(6, 8);
		t.teaParty(3, 8);
		t.teaParty(20, 6);
		System.out.println(t.teaParty(6, 8));
		System.out.println(t.teaParty(3, 8));
		System.out.println(t.teaParty(20, 6));
	}

}

//}
