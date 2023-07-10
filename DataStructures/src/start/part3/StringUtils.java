package start.part3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
}
