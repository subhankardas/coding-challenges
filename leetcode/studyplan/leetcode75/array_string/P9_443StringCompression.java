package leetcode.studyplan.leetcode75.array_string;

import java.util.Arrays;

public class P9_443StringCompression {
    public static void main(String[] args) {
        char[] chars1 = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int len1 = new P9_443StringCompression().compress(chars1);
        System.out.println(Arrays.toString(chars1) + " " + len1);

        char[] chars2 = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        int len2 = new P9_443StringCompression().compress(chars2);
        System.out.println(Arrays.toString(chars2) + " " + len2);
    }

    public int compress(char[] chars) {
        if (chars.length == 0 || chars.length == 1) {
            return chars.length;
        }

        int resIdx = 0;
        int count = 0;
        char last = chars[0];

        for (int idx = 0; idx < chars.length; idx++) {
            if (chars[idx] != last) {
                chars[resIdx++] = last;
                if (count > 1) {
                    for (char ch : String.valueOf(count).toCharArray()) {
                        chars[resIdx++] = ch;
                    }
                }
                count = 0;
            }

            last = chars[idx];
            count++;
        }
        chars[resIdx++] = last;
        if (count > 1) {
            for (char ch : String.valueOf(count).toCharArray()) {
                chars[resIdx++] = ch;
            }
        }

        return resIdx;
    }
}
