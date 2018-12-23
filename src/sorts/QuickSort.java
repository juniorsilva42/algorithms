// Jr Silva 22/12/2018
// Implementação recursiva do método de ordenação QuickSort

package sorts;

import java.util.Arrays;

public class QuickSort implements GenericSortImplementation {

    public static void main (String... args) {
        Integer[] arr = {1, 2, 432, 4, 3, 6, 7, 0, 23, 100, 120, 22, 58};
        String[] arr2 = {"Omega", "Alfa", "Arroz", "Beta", "Feijão", "Zulu", "Charlie", "Delta", "Bravo", "Tango"};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        quickSort.sort(arr2);

        print(arr2);
    }

    @Override
    public <T extends Comparable<T>> T[] sort(T[] arrangement) {
        int arrangementLength = arrangement.length - 1;

        executeSort(arrangement, 0, arrangementLength);
        return arrangement;
    }

    private static <T extends Comparable<T>> void executeSort (T[] arrangement, int left, int right) {
        if (left < right) {
            int pivot = partition(arrangement, left, right);
            executeSort(arrangement, left, pivot - 1);
            executeSort(arrangement, pivot, right);
        }
    }

    private static <T extends Comparable<T>> int partition (T[] arrangement, int left, int right) {
        int middle = (left + right) / 2;
        T pivot = arrangement[middle];

        while (left <= right) {
            while (less(arrangement[left], pivot))
                ++left;

            while (less(pivot, arrangement[right]))
                --right;

            if(left <= right) {
                swap(arrangement, left, right);
                ++left;
                --right;
            }
        }

        return left;
    }

    static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    static <T> boolean swap(T[] arrangement, int idx, int idy){
        T swap = arrangement[idx];
        arrangement[idx] = arrangement[idy];
        arrangement[idy] = swap;
        return true;
    }

    static void print(Object[] toPrint){
        System.out.println(Arrays.toString(toPrint));
    }
}
