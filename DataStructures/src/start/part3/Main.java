package start.part3;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 7};
        var search = new Search();
        var index = search.jumpSearch(numbers, 5);
        System.out.println(index);
    }
}
