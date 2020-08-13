package CodingBat.Array2;

public class Array2Sum67 {
	//Return the sum of the numbers in the array, 
	//except ignore sections of numbers starting with a 6 
	//and extending to the next 7 (every 6 will be followed by at least one 7). 
	//Return 0 for no numbers.

	//sum67([1, 2, 2]) → 5
	//sum67([1, 2, 2, 6, 99, 99, 7]) → 5
	//sum67([1, 1, 6, 7, 2]) → 4
	
	public int sum67(int[] nums) {
		if(nums.length == 0) {
			return 0;
			}
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if  (nums[i] < 6 ) {
				sum = sum + nums[i];
			}
		}
		return sum;
	}
	
	
	public static void main(String[]args) {
		Array2Sum67 t = new Array2Sum67();
		int[]nums1 = {1, 2, 2};
		int[]nums2 = {1, 2, 2, 6, 99, 99, 7};
		int[]nums3 = {1, 1, 6, 7, 2};
		System.out.println(t.sum67(nums1));	
		System.out.println(t.sum67(nums2));
		System.out.println(t.sum67(nums3));
	}}

