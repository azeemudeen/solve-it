package leetcode.problems;

public class Problem2_PivotIndex {
	public static void main(String[] args) {
		Problem2_PivotIndex obj = new Problem2_PivotIndex();
		
		System.out.println(obj.pivotIndex(new int[] {1,7,3,6,5,6}));
		System.out.println(obj.pivotIndex1(new int[] {1,7,3,6,5,6}));
	}

	public int pivotIndex(int[] nums) { 
		for(int i=0; i < nums.length; i++){
			int leftSum = 0;
			int rightSum = 0;
			for(int left=0; left<i; left++){
				leftSum += nums[left];
			}
			for(int right=nums.length-1; right>i; right--){
				rightSum += nums[right];
			}

			if(leftSum == rightSum){
				return i;
			}
		}
		return -1;
	}

	public int pivotIndex1(int[] nums) { 
		int temp = 0;
		int[] rightSumArr = new int[nums.length];
		for(int i=0; i < nums.length; i++){
			temp += nums[i];
			rightSumArr[i] = temp;
		}

		temp = 0;
		int[] leftSumArr = new int[nums.length];
		for(int i=nums.length-1; i>=0; i--){
			temp += nums[i];
			leftSumArr[i] = temp;
		}

		for(int i=0; i < nums.length; i++){
			if(leftSumArr[i] == rightSumArr[i]) {
				return i;
			}
		}

		return -1;
	}
}
