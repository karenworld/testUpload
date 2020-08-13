package CodingBat.Logic1;

public class int1to10 {
	//Given a number n, return true if n is in the range 1..10, inclusive. 
	//Unless outsideMode is true, in which case return true if the number is less or equal to 1, 
	//or greater or equal to 10.

		//in1To10(5, false) → true
		//	in1To10(11, false) → false
		//	in1To10(11, true) → true
	
	public boolean in1To10(int n, boolean outsideMode) {
	if ( n >= 1 && n <= 10  && outsideMode == false) {
	return true;
	}
	if ( n <= 1 && n >= 10 || outsideMode == true)
		return true;
	else 
		return false;
	}
		
	

public static void main(String[] args) {
	int1to10 t = new int1to10();
	t.in1To10(5, false);
    t.in1To10(11, false);
    t.in1To10(11, true);
    System.out.println(t.in1To10(5, false));
    System.out.println(t.in1To10(11, false));
    System.out.println(t.in1To10(11, true));
}}
