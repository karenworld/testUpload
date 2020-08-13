package CodingBat.Logic1;

public class caughtSpeeding {
	// You are driving a little too fast,
	// and a police officer stops you. Write code to compute the result,
	// encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
	// If speed is 60 or less, the result is 0. If speed is between 61 and 80
	// inclusive,
	// the result is 1. If speed is 81 or more, the result is 2. Unless it is your
	// birthday
	// -- on that day, your speed can be 5 higher in all cases.

	// caughtSpeeding(60, false) → 0
	// caughtSpeeding(65, false) → 1
	// caughtSpeeding(65, true) → 0

	public int caughtSpeeding(int speed, boolean isBirthday) {
//		int nticket = 0;
//		int sticket = 1;
//		int bticket = 2;
//		int birthday = 5;
//
//		if (speed <= 60) {
//			return nticket;
//		} else if (speed >= 61 && speed <= 80) {
//			return sticket;
//		} else if (speed >= 81) {
//			return bticket;
//		}
//		while(isBirthday == true) {
//			if (speed >= 5) {
//				return birthday;
//			}
//			if (speed == 65) {
//				return nticket;
//			}
//		}
//		return birthday;
//	}

	
		//public int caughtSpeeding(int speed, boolean isBirthday) {
			  if ( speed > 65 && speed <= 85 && isBirthday == true )
			   return 1;
			  if ( speed >= 86 && isBirthday == true )
			   return 2;
			  if ( speed <= 65 && isBirthday == true )
			   return 0;
			  if ( speed > 60 && speed <= 80 )
			   return 1;
			  if ( speed >= 81 )
			   return 2;
			  else
			   return 0;
			   
			}
		
	public static void main(String[] args) {
		caughtSpeeding t = new caughtSpeeding();
		t.caughtSpeeding(60, false);
		t.caughtSpeeding(65, false);
		t.caughtSpeeding(65, true);
		System.out.println(t.caughtSpeeding(60, false));
		System.out.println(t.caughtSpeeding(65, false));
		System.out.println(t.caughtSpeeding(65, true));
	}
}
