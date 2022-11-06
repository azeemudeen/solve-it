package leetcode.problems;

import java.util.Arrays;

//1480. Running Sum of 1d Array

public class Problem1_RunningSum {
	public static void main(String[] args) {
		Problem1_RunningSum obj = new Problem1_RunningSum();
		System.out.println(Arrays.toString(obj.runningSum(new int[]{1,2,3,4,5})));
	}
	
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[--i];
            i++;
        }
        return nums;
    }
}
