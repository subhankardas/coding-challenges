package leetcode.studyplan.leetcode75.two_pointers;

import java.util.Arrays;

public class P1_283MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        new P1_283MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int nzIdx = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] != 0) {
                nums[nzIdx] = nums[idx]; // swap non-zero element with zero element
                nzIdx++;
            }
        }
        for (int idx = nzIdx; idx < nums.length; idx++) { // fill remaining elements with 0
            nums[idx] = 0;
        }
    }
}
