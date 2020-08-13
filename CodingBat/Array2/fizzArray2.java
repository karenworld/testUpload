package CodingBat.Array2;
import java.util.Arrays;

public class fizzArray2 {
	// Given a number n, create and return a new string array of length n,
	// containing the strings "0", "1" "2" .. through n-1.
	// N may be 0, in which case just return a length 0 array.
	// Note: String.valueOf(xxx) will make the String form of most types.
	// The syntax to make a new string array is: new String[desired_length]
	// (See also: FizzBuzz Code)

	// fizzArray2(4) → ["0", "1", "2", "3"]
	// fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
	// fizzArray2(2) → ["0", "1"]
	public String[] fizzArray2(int n) {
		String[]a = new String[n];
		if (n == 0) {
			return a;
		}//
		for (int i = 0; i < n ; i++) {
			a[i] = String.valueOf(i); //String.valueOf(i) will turn it into an int
				}
			return a;

	}

	public static void main(String[] args) {
		fizzArray2 t = new fizzArray2();
		t.fizzArray2(4);
		t.fizzArray2(10);
		t.fizzArray2(2);
		t.fizzArray2(0);
		System.out.println(Arrays.deepToString(t.fizzArray2(4)));
		System.out.println(Arrays.toString(t.fizzArray2(10)));
		System.out.println(Arrays.toString(t.fizzArray2(2)));
		System.out.println(Arrays.toString(t.fizzArray2(0)));
	}
}
