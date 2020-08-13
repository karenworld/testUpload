package CodingBat.Array2;

public class Array2More14 {
			//Given an array of ints, 
			//return true if the number of 1's is greater than
			//the number of 4's

			//more14([1, 4, 1]) → true
			//more14([1, 4, 1, 4]) → false
			//more14([1, 1]) → true

	public boolean more14(int[] nums) {
		boolean isTrue = false;
		int count1 = 0;
		int count4 = 0;
		for(int i = 0; i< nums.length; i++) {
		if(nums[i] == 1){
			count1++;
		}else {
		if(nums[i] == 4) {
			count4++;
		}
		if (count1 > count4) { 
			isTrue = true; // note: can't just return true; need to declare boolean isTrue first
		}
		return true;
		}
		}
		return false;

	}
	public static void main(String[]args) {
		Array2More14 t = new Array2More14();
		int[]nums1 = {1, 4, 1};
		int[]nums2 = {1, 4, 1, 4};
		int[]nums3 = {1, 1};
		System.out.println(t.more14(nums1));	
		System.out.println(t.more14(nums2));
		System.out.println(t.more14(nums3));
	}
	
	}
