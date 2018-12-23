package sorts;

import java.util.List;

public class QuickSort implements GenericSortImplementation {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] arrangement) {
        return null;
    }

    @Override
    public <T extends Comparable<T>> List<T> sort(List<T> arrangement) {
        return null;
    }

    private static <T extends Comparable<T>> void executeSort (T[] arrangement, int left, int right) {
        int pivot = partition(arrangement, left, right);
        executeSort(arrangement, left, pivot - 1);
        executeSort(arrangement, pivot, right);
    }


}
