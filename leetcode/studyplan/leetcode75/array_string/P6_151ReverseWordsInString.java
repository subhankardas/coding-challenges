package leetcode.studyplan.leetcode75.array_string;

public class P6_151ReverseWordsInString {
    public static void main(String[] args) {
        P6_151ReverseWordsInString obj = new P6_151ReverseWordsInString();
        System.out.println(obj.reverseWords("the sky is blue"));
        System.out.println(obj.reverseWords("  hello world  "));
        System.out.println(obj.reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}