package start.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int d = 4;

        var result = ArrayUtils.rotLeft(a, d);
        System.out.println(result);
    }
}
