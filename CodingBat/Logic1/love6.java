package CodingBat.Logic1;

public class love6 {
	
	//The number 6 is a truly great number. Given two int values, a and b, 
	//return true if either one is 6. Or if their sum or difference is 6. 
	//Note: the function Math.abs(num) computes the absolute value of a number.

		//	love6(6, 4) → true
		//	love6(4, 5) → false
		//	love6(1, 5) → true
	
	public boolean love6(int a, int b) {
	 int sum = 0;
	 if ((a + b == 6) || (a - 6 == 6) || (a == 6) || (b == 6)) {
		 return true;
	 }
	 return false;
	}
	
	public static void main(String[] args) {
		love6 t = new love6();
		t.love6(6, 4);
	    t.love6(9, 4);
	    t.love6(10, 11);
	    System.out.println(t.love6(6, 4));
	    System.out.println(t.love6(9, 4));
	    System.out.println(t.love6(1, 5));
	}
	
	}

