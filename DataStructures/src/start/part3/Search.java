package start.part3;

public class Search {
    public int linearSearch(int[] array, int targetValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetValue)
                return i;
        }
        return -1;
    }


}
