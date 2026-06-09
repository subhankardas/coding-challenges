package leetcode.studyplan.leetcode75.array_string;

public class P2_1071GreatestCommonDivisorStrings {

    public static void main(String[] args) {
        P2_1071GreatestCommonDivisorStrings obj = new P2_1071GreatestCommonDivisorStrings();

        System.out.println(obj.gcdOfStrings("ABCABC", "ABC"));
        System.out.println(obj.gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(obj.gcdOfStrings("LEET", "CODE"));
    }

    public String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }

        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
