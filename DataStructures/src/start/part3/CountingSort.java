package start.part3;

import java.util.Arrays;

public class CountingSort {
    public void sort(int[] array, int max) {
        int[] counts = new int[max + 1];
        for (var item : array)
            counts[item]++;
        System.out.println(Arrays.toString(counts));

        var k = 0;
        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++)
                array[k++] = i;
        }
    }
}
