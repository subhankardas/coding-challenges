package leetcode.studyplan.leetcode75.array_string;

public class P5_345ReverseVowelsString {

    public static void main(String[] args) {
        P5_345ReverseVowelsString obj = new P5_345ReverseVowelsString();

        System.out.println(obj.reverseVowels("IceCreAm"));
        System.out.println(obj.reverseVowels("leetcode"));
    }

    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int len = s.length();
        int p1 = 0, p2 = len - 1;

        while (p1 < p2) {
            while (p1 < p2 && !isVowel(sb.charAt(p1))) {
                p1++;
            }
            while (p1 < p2 && !isVowel(sb.charAt(p2))) {
                p2--;
            }

            if (p1 < p2) {
                char temp = sb.charAt(p1);
                sb.setCharAt(p1, sb.charAt(p2));
                sb.setCharAt(p2, temp);
                p1++;
                p2--;
            }
        }

        return sb.toString();
    }

    public boolean isVowel(char c) {
        return c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' ||
                c == 'O' || c == 'o' || c == 'U' || c == 'u';
    }

}
