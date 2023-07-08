package start.part3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 7, 2, 6, 4};
        var sorter = new CountingSort();
        sorter.sort(numbers, 7);
        System.out.println(Arrays.toString(numbers));
    }
}
