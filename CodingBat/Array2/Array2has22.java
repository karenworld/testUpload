package CodingBat.Array2;

public class Array2has22 {
	//Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

		//	has22([1, 2, 2]) → true
		//	has22([1, 2, 1, 2]) → false
		//	has22([2, 1, 2]) → false
	
	public boolean has22(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) { // without -1 then it will add the last number which doesn't exist
		//for(int a : nums)	
		//if((nums[a] == 2)  && (nums[a+1] == 2)){
			if((nums[i] == 2 ) && (nums[i+1] == 2))
			return true;
			}			
		//}
		return false;}
	
	public static void main(String[]args) {
		Array2has22 t = new Array2has22();
		int[]nums1 = {1, 2, 2};
		int[]nums2 = {1, 2, 1, 2};
		int[]nums3 = {2, 1, 2};
		System.out.println(t.has22(nums1));
		System.out.println(t.has22(nums2));
		System.out.println(t.has22(nums3));
}}
