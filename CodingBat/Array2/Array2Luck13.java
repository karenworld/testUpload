package CodingBat.Array2;

public class Array2Luck13 {
		
		//Given an array of ints, return true if the array 
		
	//contains no 1's and no 3's.

		//	lucky13([0, 2, 4]) → true
		//	lucky13([1, 2, 3]) → false
		//	lucky13([1, 2, 4]) → false
			
	public boolean lucky13(int[] nums) {
	for(int i = 0; i < nums.length; i++) {
		if((nums[i] == 1 || nums[i] == 3)) { // note: can't use (!nums[i] !=1 and can't use (if (nums == 1 return true)
			return false;
		}		
	}
		return true;
	}
	
	// alternate method
//	public boolean more14(int[] nums) {
//		int one = 0;
//		int four = 0;
//
//		for(int i = 0; i < nums.length; i++){
//		if(nums[i] == 1){
//		one++;
//		} else if(nums[i] == 4){
//		four++;
//		}
//		}
//
//		if(one > four){
//		return true;
//		} else {
//		return false;
//		}
//
//		}
	
	public static void main(String[]args) {
		Array2Luck13 t = new Array2Luck13();
		int[]nums1 = {0, 2, 4};
		int[]nums2 = {1, 2, 3};
		int[]nums3 = {1, 2, 4};
		System.out.println(t.lucky13(nums1));
		System.out.println(t.lucky13(nums2));
		System.out.println(t.lucky13(nums3));
}	
	
	}
//}
