package CodingBat.Array2;

import java.util.Arrays;

public class Array2shiftLeft {
	// need to revise this one.  note if nums is any array 
	//& not int you can't put it inside another array so got to use nums.length
	//Return an array that is "left shifted" by one -- 
	//so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify 
	//and return the given array, or return a new array.

		//	shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
		//	shiftLeft([1, 2]) → [2, 1]
		//	shiftLeft([1]) → [1]
	
//	public int[] shiftLeft(int[] nums) {
//		//int[] temp = new int[nums+1];
//		int[]a = new int[nums.length];
//		//if (nums.length > 0) {
//		int first = nums[0];
//	//	int[]b = new int[temp + a];
//	//	int [] full = new int[nums + temp];
//		for(int i = 0; i < nums.length - 1; i++) {		
//		
//			a[i] = nums[i + 1];	
//		//	nums[i] = nums[i + 1];
//			//nums[nums.length - 1] = first;
//		//int[]b = new int[++i];
//		//a = nums[i] + new int[i++];
//		//temp = a[i]+ b;
//		}
//		//}
//		return a;
	//return nums;
	//}
	
	public int[]shiftLeft(int[]nums){
		int[]a = new int[nums.length];
		int len = nums.length;
		for(int i = 0; i < nums.length - 1; i++) {
			a[i] = nums[(i+1)];
			int b = a[(i + 1)%len];
		}
		return a;
	}
	
//	public int[] shiftLeft(int[] nums) {
//	    if (nums.length > 0) {
//	        int first = nums[0];
//	        for (int i = 0; i < nums.length - 1; i++)
//	            nums[i] = nums[i + 1];
//	        nums[nums.length - 1] = first;
//	    }
//	    return nums;
//	}
//	public int[] shiftLeft(int[] nums) {
//		int len = nums.length;
//		int[] result = new int[len];
//
//		for (int i = 0; i < len; i++) {
//		result[i] = nums[(i + 1) % len];
//		}
//
//		return result;

		//}
		
	public static void main(String[]args) {
		Array2shiftLeft t = new Array2shiftLeft();
		  int[]nums1 = {6,2,5,3};
		  t.shiftLeft(nums1);
		  int[]nums2 = {1,2};
		  t.shiftLeft(nums2);
		  int[]nums3 = {1};
		  t.shiftLeft(nums3);
		System.out.println((Arrays.toString(t.shiftLeft(nums1))));
		System.out.println((Arrays.toString(t.shiftLeft(nums2))));
		System.out.println((Arrays.toString(t.shiftLeft(nums3))));
		}
	}
