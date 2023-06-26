package start.part2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 10, 1, 4, 2};
        var heap = new Heap();
        for (var number : numbers)
            heap.insert(number);
        for (int i = numbers.length - 1; i >= 0; i--)
            numbers[i] = heap.remove();
        System.out.println(Arrays.toString(numbers));
    }
}
