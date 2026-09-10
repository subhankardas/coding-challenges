package leetcode.studyplan.leetcode75.array_string;

import java.util.Arrays;

public class P7_238ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(new P7_238ProductOfArrayExceptSelf().productExceptSelf(new int[] { 1, 2, 3, 4 })));
        System.out.println(
                Arrays.toString(new P7_238ProductOfArrayExceptSelf().productExceptSelf(new int[] { -1, 1, 0, -3, 3 })));
    }

    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        int left = 1;
        for (int i = 0; i < len; i++) { // left products
            result[i] = left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = len - 1; i >= 0; i--) { // right products
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}
