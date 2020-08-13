package CodingBat.Logic1;

public class less20 {
	//Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
	//So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod

		//	less20(18) → true
		//	less20(19) → true
		//	less20(20) → false
	public boolean less20(int n) {
	if ((n%20==18 || n%20== 19)) {
		//if ((n%4 == 0) || (n%5 == 0)) {
		return true;
	}else {
		return false;
	}}
	
	public static void main(String[] args) {
		less20 t = new less20();
		t.less20(18);	
	    t.less20(19);
	    t.less20(20);
	    System.out.println(t.less20(18));
	    System.out.println(t.less20(19));
	    System.out.println(t.less20(20));
	}}


