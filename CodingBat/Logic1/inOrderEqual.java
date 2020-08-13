package CodingBat.Logic1;

public class inOrderEqual {
	//Given three ints, a b c, return true if they are in strict increasing order, 
	//such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, 
	//equality is allowed, such as 5 5 7 or 5 5 5.

		//	inOrderEqual(2, 5, 11, false) → true
		//	inOrderEqual(5, 7, 6, false) → false
		//	inOrderEqual(5, 5, 7, true) → true
	
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
	if(( c > b && b > a) || equalOk == true) {
		return true;
	}
	if (c < b || b < a || c < a) {
	return false;
	}else {
	return true;
	}}
	
//	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
//		  if (equalOk == true && a <= b && b <= c)
//		   return true;
//		  if ( b > a && c > b )
//		   return true;
//		  else
//		   return false;
//		}
	

public static void main(String[] args) {
	inOrderEqual t = new inOrderEqual();
	t.inOrderEqual(2, 5, 11, false);
    t.inOrderEqual(5, 7, 6, false);
    t.inOrderEqual(5, 5, 7, true);
    System.out.println(t.inOrderEqual(2, 5, 11, false));
    System.out.println(t.inOrderEqual(5, 7, 6, false));
    System.out.println(t.inOrderEqual(5, 5, 7, true));
}

}