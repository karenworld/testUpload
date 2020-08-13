package CodingBat.Logic1;

public class twoAsOne {
	//Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

		//	twoAsOne(1, 2, 3) → true
		//	twoAsOne(3, 1, 2) → true
		//	twoAsOne(3, 2, 2) → false

	public boolean twoAsOne(int a, int b, int c) {
	if(( a + b == c) || (a + c == b) || (b + c == a)){
		return true;
	}
		return false;
	}


public static void main(String[] args) {
	twoAsOne t = new twoAsOne();
	t.twoAsOne(1, 2, 3);
    t.twoAsOne(3, 1, 2);
    t.twoAsOne(3, 2, 2);
    System.out.println(t.twoAsOne(1, 2, 3));
    System.out.println(t.twoAsOne(3, 1, 2));
    System.out.println(t.twoAsOne(3, 2, 2));
}

}



