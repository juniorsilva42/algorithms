// Jr Silva 22/12/2018
// Implementação recursiva do método de ordenação QuickSort

package sorts;

import sorts.Implementation.GenericSortInterface;

import static sorts.Implementation.SortHelpers.*;

public class QuickSort implements GenericSortInterface {

    /**
     *
     * Testes simples da classe
     *
     * @references
       * https://pt.wikipedia.org/wiki/Quicksort
     * */
    public static void main (String... args) {
        Integer[] arr = {1, 2, 432, 4, 3, 6, 7, 0, 23, 100, 120, 22, 58};
        String[] arr2 = {"Omega", "Alfa", "Arroz", "Beta", "Feijão", "Zulu", "Charlie", "Delta", "Bravo", "Tango"};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        quickSort.sort(arr2);

        show(arr2);
    }

    /**
     *
     * Método sobrescrito da interface genérica que executa a ordenação dado um arranjo qualquer
     *
     * @param arrangement arranjo que será ordenado
     *
     * @return void
     * */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] arrangement) {
        int arrangementLength = arrangement.length - 1;

        sort(arrangement, 0, arrangementLength);
        return arrangement;
    }

    /**
     *
     * Método principal que executa a ordenação de forma recursiva
     *
     * @param arrangement arranjo que será ordenado
     * @param left indice da esquerda do arranjo
     * @param right indice da direita do arranjo
     *
     * @return void
     * */
    private static <T extends Comparable<T>> void sort (T[] arrangement, int left, int right) {
        if (left < right) {
            int pivot = partition(arrangement, left, right);
            sort(arrangement, left, pivot - 1);
            sort(arrangement, pivot, right);
        }
    }


    /**
     *
     * Método que separa o arranjo e o ordena baseado em seu pivô. Aqui esta o coração da implementação do QS
     *
     * @param arrangement arranjo que será ordenado
     * @param left indice da esquerda do arranjo
     * @param right indice da direita do arranjo
     *
     * @return int
     * */
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

}
