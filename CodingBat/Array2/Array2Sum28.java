package CodingBat.Array2;

public class Array2Sum28 {
	//Given an array of ints, 
	//return true if the sum of all the 2's in the array is exactly 8.

			//sum28([2, 3, 2, 2, 4, 2]) → true
			//sum28([2, 3, 2, 2, 4, 2, 2]) → false
			//sum28([1, 2, 3, 4]) → false
	public boolean sum28(int[] nums) {
		int sum = 0;
	for(int i = 0; i < nums.length; i++) {		
		
		
		//if((nums[i]== 2) && ((sum +=2) == 8)) {
	if((nums[i]== 2))	
		sum += 2;
		
	if(sum == 8) {
	return true;		
	}
	}
	return false;
	}
	public static void main(String[]args) {
		Array2Sum28 t = new Array2Sum28();
		int[]nums1 = {2, 3, 2, 2, 4, 2};
		int[]nums2 = {2, 3, 2, 2, 4, 2, 2};
		int[]nums3 = {1, 2, 3, 4};
		System.out.println(t.sum28(nums1));
		System.out.println(t.sum28(nums2));
		System.out.println(t.sum28(nums3));
}	

	//newer way to do the code
//	public static <T> boolean checkNum(T[] arr, T n) {
//        
//        for(int j = 0; j < arr.length; j++) {
//            if(n.equals(arr[j]))
//                return true;
//        }
//         
//         
//        return false;
//         
//    }

}
