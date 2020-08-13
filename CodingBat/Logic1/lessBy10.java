package CodingBat.Logic1;

public class lessBy10 {
	//Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

	//		lessBy10(1, 7, 11) → true
	//		lessBy10(1, 7, 10) → false
	//		lessBy10(11, 1, 7) → true

	public boolean lessBy10(int a, int b, int c) {
	if (a -b >= 10 || a - c >= 10 || b - a>= 10 ||b - c >= 10 || c - a>= 10 || c - b>= 10) {
		return true;
	} 
	return false;	
	}
	
	public static void main(String[] args) {
		lessBy10 t = new lessBy10();
		t.lessBy10(1, 7, 11);
	    t.lessBy10(1, 7, 10);
	    t.lessBy10(11, 1, 7);
	    System.out.println(t.lessBy10(1, 7, 11));
	    System.out.println(t.lessBy10(1, 7, 10));
	    System.out.println(t.lessBy10(11, 1, 7));
	}}



	
//}
