package CodingBat.Logic1;

public class more20 {
	//Return true if the given non-negative number is 1 or 2 more than a multiple of 20. 
	//See also: Introduction to Mod

	//more20(20) → false
	//more20(21) → true
	//more20(22) → true
	public boolean more20(int n) {
		if ( n %20 == 0) {
			return false;
		}else 
			return true;			
		}
	

public static void main(String[] args) {
	more20 t = new more20();
	t.more20(20);	
    t.more20(21);
    t.more20(22);
    System.out.println(t.more20(20));
    System.out.println(t.more20(21));
    System.out.println(t.more20(22));
}}



