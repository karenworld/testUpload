package CodingBat.Array2;

public class Array2Sum13 {
	// Return the sum of the numbers in the array,
	// returning 0 for an empty array.
	// Except the number 13 is very unlucky, so it does not count
	// and numbers that come immediately after a 13 also do not count.

	// sum13([1, 2, 2, 1]) → 6
	// sum13([1, 1]) → 2
	// sum13([1, 2, 2, 1, 13]) → 6
	public int sum13(int[] nums) {
		if(nums.length == 0 ) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 13) {
				//System.out.println(nums[i]);
				sum += nums[i];			
			}
		}
				return sum;		
			}

	public static void main(String[] args) {
		Array2Sum13 t = new Array2Sum13();
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 1, 1 };
		int[] nums3 = {1, 2, 2, 1, 13};
		System.out.println(t.sum13(nums1));
		System.out.println(t.sum13(nums2));
		System.out.println(t.sum13(nums3));
	}
}
