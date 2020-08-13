package CodingBat.Logic1;

public class teenSum {
	//Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, 
	//are extra lucky. So if either value is a teen, just return 19.

		//	teenSum(3, 4) → 7
		//	teenSum(10, 13) → 19
		//	teenSum(13, 2) → 19
	
	public int teenSum(int a, int b) {
	if (a == 13 || b == 13 ) {
		return 19;
	}
		return a+b; 
	}


public static void main(String[] args) {
	 teenSum t = new  teenSum();
	t. teenSum(3,4);	
    t. teenSum(10,13);
    t. teenSum(13,2);
    System.out.println(t. teenSum(3,4));
    System.out.println(t. teenSum(10,13));
    System.out.println(t. teenSum(13,2));
}}
