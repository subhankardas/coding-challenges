package leetcode.studyplan.leetcode75.two_pointers;

public class P2_392IsSubsequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(new P2_392IsSubsequence().isSubsequence(s, t));
        s = "axc";
        t = "ahbgdc";
        System.out.println(new P2_392IsSubsequence().isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {
        int sIdx = 0, tIdx = 0;
        while (sIdx < s.length() && tIdx < t.length()) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++;
            }
            tIdx++;
        }
        return sIdx == s.length();
    }
}
