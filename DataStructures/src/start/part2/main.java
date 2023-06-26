package start.part2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 1, 2};
        MaxHeap.heapify(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
