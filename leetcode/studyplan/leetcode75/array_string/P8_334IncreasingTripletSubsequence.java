package leetcode.studyplan.leetcode75.array_string;

public class P8_334IncreasingTripletSubsequence {
    public static void main(String[] args) {
        System.out.println(new P8_334IncreasingTripletSubsequence().increasingTriplet(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(new P8_334IncreasingTripletSubsequence().increasingTriplet(new int[] { 5, 4, 3, 2, 1 }));
        System.out.println(new P8_334IncreasingTripletSubsequence().increasingTriplet(new int[] { 2, 1, 5, 0, 4, 6 }));
    }

    public boolean increasingTriplet(int[] nums) {
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;
        for (int idx = 0; idx < nums.length; idx++) {
            int num3 = nums[idx];
            if (num3 <= num1) {
                num1 = num3;
            } else if (num3 <= num2) {
                num2 = num3;
            } else { // num3 > num2 > num1 - triplet found
                return true;
            }
        }
        return false;
    }
}
