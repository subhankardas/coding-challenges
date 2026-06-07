package leetcode.studyplan.leetcode75.array_string;

public class P1_1768MergeStringsAlternately {

    public static void main(String[] args) {
        P1_1768MergeStringsAlternately obj = new P1_1768MergeStringsAlternately();

        System.out.println(obj.mergeAlternately("abc", "pqr"));
        System.out.println(obj.mergeAlternately("abcd", "pq"));
        System.out.println(obj.mergeAlternately("pqrst", "efg"));
        System.out.println(obj.mergeAlternately("1357", "246890"));
    }

    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder res = new StringBuilder();

        // Merge the two strings until the end of the shorter string is reached
        for (int idx = 0; idx < Math.min(len1, len2); idx++) {
            res.append(word1.charAt(idx));
            res.append(word2.charAt(idx));
        }

        // Append the remaining characters of the longer string, if any
        if (Math.max(len1, len2) == len1) {
            res.append(word1.substring(len2));
        } else {
            res.append(word2.substring(len1));
        }
        return res.toString();
    }

}
