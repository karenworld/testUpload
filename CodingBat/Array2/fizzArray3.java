package CodingBat.Array2;
import java.util.Arrays;

public class fizzArray3 {
	//Given start and end numbers, 
	//return a new array containing the sequence of integers 
	//from start up to but not including end, 
	//so start=5 and end=10 yields {5, 6, 7, 8, 9}. 
	//The end number will be greater or equal to the start number. 
	//Note that a length-0 array is valid. (See also: FizzBuzz Code)

		//	fizzArray3(5, 10) → [5, 6, 7, 8, 9]
		//	fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
		//	fizzArray3(1, 3) → [1, 2]

	public int[] fizzArray3(int start, int end) {
		int n = end - start;
		int[]a = new int[n];
		if (n == 0) {
			return a;
		}
		for (int i = 0; i < n; i++) {// cannot use int i = start
			a[i] = start++;
			
	}
		return a;
}

public static void main(String[] args) {
	fizzArray3 t = new fizzArray3();
	t.fizzArray3(5,10);
	t.fizzArray3(11,18);
	t.fizzArray3(1,3);

	System.out.println(Arrays.toString(t.fizzArray3(5,10)));
	System.out.println(Arrays.toString(t.fizzArray3(11,18)));
	System.out.println(Arrays.toString(t.fizzArray3(1,3)));
	System.out.println(Arrays.toString(t.fizzArray3(0,0)));
}
}