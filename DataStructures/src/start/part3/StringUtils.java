package start.part3;

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
}
