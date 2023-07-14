package start.part3;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int n = a.size();
        List<Integer> rotated = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            rotated.add(a.get((i + d) % n));
        }

        return rotated;
    }
}
