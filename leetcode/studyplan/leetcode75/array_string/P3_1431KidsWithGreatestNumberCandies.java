package leetcode.studyplan.leetcode75.array_string;

import java.util.ArrayList;
import java.util.List;

public class P3_1431KidsWithGreatestNumberCandies {

    public static void main(String[] args) {
        P3_1431KidsWithGreatestNumberCandies obj = new P3_1431KidsWithGreatestNumberCandies();

        System.out.println(obj.kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3));
        System.out.println(obj.kidsWithCandies(new int[] { 4, 2, 1, 1, 2 }, 1));
        System.out.println(obj.kidsWithCandies(new int[] { 12, 12, 5, 3, 1, 11 }, 10));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int candy : candies) {
            res.add(candy + extraCandies >= max);
        }
        return res;
    }

}
