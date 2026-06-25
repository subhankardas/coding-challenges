package leetcode.studyplan.leetcode75.array_string;

public class P4_605CanPlaceFlowers {

    public static void main(String[] args) {
        P4_605CanPlaceFlowers obj = new P4_605CanPlaceFlowers();

        System.out.println(obj.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 1));
        System.out.println(obj.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 2));
        System.out.println(obj.canPlaceFlowers(new int[] { 0, 0, 1, 0, 1 }, 1));
        System.out.println(obj.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1, 0, 0 }, 2));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;

        for (int idx = 0; idx < flowerbed.length && n > 0; idx++) {
            if (flowerbed[idx] != 0)
                continue;

            boolean emptyLeft = idx == 0 || flowerbed[idx - 1] == 0;
            boolean emptyRight = idx == flowerbed.length - 1 || flowerbed[idx + 1] == 0;

            if (emptyLeft && emptyRight) {
                flowerbed[idx] = 1;
                n--;
            }
        }

        return n <= 0;
    }

}
