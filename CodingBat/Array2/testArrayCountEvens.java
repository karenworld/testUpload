package CodingBat.Array2;

public class testArrayCountEvens {
	public int countEvens(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {	
		if(nums[i]%2 == 0) {
			count++;
		}
		}
		return count;
	}
	public static void main(String[]args) {
		testArrayCountEvens t = new testArrayCountEvens();
		int[]nums1 = {2, 1, 2, 3, 4};
		System.out.println(t.countEvens(nums1));
	}}
