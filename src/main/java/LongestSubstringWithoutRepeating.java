import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<Character>();
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Example usage:
        String str1 = "abcabcbb"; // Output: 3 ("abc" or "bca")
        String str2 = "bbbbb";    // Output: 1 ("b")
        String str3 = "pwwkew";   // Output: 3 ("wke")

        System.out.println("Input: " + str1);
        System.out.println("Length of Longest Substring: " + lengthOfLongestSubstring(str1));

        System.out.println("\nInput: " + str2);
        System.out.println("Length of Longest Substring: " + lengthOfLongestSubstring(str2));

        System.out.println("\nInput: " + str3);
        System.out.println("Length of Longest Substring: " + lengthOfLongestSubstring(str3));
    }
}
