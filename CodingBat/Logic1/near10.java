package CodingBat.Logic1;

public class near10 {
	//Given a non-negative number "num", 
	//return true if num is within 2 of a multiple of 10. 
	//Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod

		//	nearTen(12) → true
		//	nearTen(17) → false
		//	nearTen(19) → true

	public boolean nearTen(int num) {
	if(num%10==2 || num%10==9||num%10==8||num%10==1||num%10==0) {
		//if(num%10 == 8) {
		return true;
	}else {
		return false;
	}
	}
	
	public static void main(String[] args) {
		near10 t = new near10();
		t.nearTen(12);	
	    t.nearTen(17);
	    t.nearTen(19);
	    System.out.println(t.nearTen(12));
	    System.out.println(t.nearTen(17));
	    System.out.println(t.nearTen(19));
	}}


