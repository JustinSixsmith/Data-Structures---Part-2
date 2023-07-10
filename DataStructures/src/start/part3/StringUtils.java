package start.part3;

import java.util.*;

public class StringUtils {
    public static int countVowels(String str) {
        if (str == null)
            return 0;

        int count = 0;
        String vowelString = "aeiou";
        Set<Character> vowels = new HashSet<>();
        for (var ch : vowelString.toCharArray())
            vowels.add(ch);

        for (var ch : str.toLowerCase().toCharArray())
            if (vowels.contains(ch))
                count++;

        return count;
    }

    public static String reverse(String str) {
        if (str == null)
            return "";

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public static String reverseWords(String sentence) {
        if (sentence == null)
            return "";

        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static boolean areRotations(String str1, String str2) {
        if (str1 == null || str2 == null)
            return false;

        return str1.length() == str2.length() && (str1 + str1).contains(str2);
    }

    public static String removeDuplicates(String str) {
        if (str == null)
            return "";

        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (var ch : str.toCharArray())
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }

        return output.toString();
    }
}
