package CodingBat.Logic1;

import java.util.HashMap;
import java.util.Map;

import CodingBat.Map.mShare;

public class cigarParty {
	//When squirrels get together for a party, they like to have cigars. 
	//A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
	//Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
	//Return true if the party with the given values is successful, or false otherwise.

	//cigarParty(30, false) → false
	//cigarParty(50, false) → true
	//cigarParty(70, true) → true
	
	public boolean cigarParty(int cigars, boolean isWeekend) {
//		isWeekend = true;
//		if(cigars >= 60 ) 
//			if(cigars <= 60 && cigars >= 40){
//			return true;
//		}while(isWeekend); 		
//			return false;
//		}
		if(isWeekend && cigars >= 40)
		    return true;
		  else if(cigars >= 40 && cigars <=60)
		    return true;
		  else
		    return false;
		}
	
		public static void main(String[] args) {
			cigarParty t = new cigarParty();
			t.cigarParty(30, false);
		    t.cigarParty(50, false);
		    t.cigarParty(70, true);
		    System.out.println(t.cigarParty(30, false));
		    System.out.println(t.cigarParty(50, false));
		    System.out.println(t.cigarParty(70, true));
		}
}	

		

