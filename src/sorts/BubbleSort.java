package sorts;

import sorts.Implementation.GenericSortInterface;

import static sorts.Implementation.SortHelpers.*;

public class BubbleSort implements GenericSortInterface {

    public static void main (String... args) {
        Integer[] arr = {1, 2, 432, 4, 3, 6, 7, 0, 23, 100, 120, 22, 58};

        BubbleSort quickSort = new BubbleSort();
        quickSort.sort(arr);

        show(arr);
    }

    @Override
    public <T extends Comparable<T>> T[] sort(T[] arrangement) {
        int lastElement = arrangement.length;

        boolean swapping;

        do {
            swapping = false;

            for (int i = 0; i < lastElement - 1; i++) {
                if (less(arrangement[i], arrangement[i+1]))
                    swapping = swap(arrangement, i, i+1);
            }

            lastElement--;

        } while (swapping);

        return arrangement;
    }


}
