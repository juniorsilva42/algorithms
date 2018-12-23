// Jr Silva 22/12/2018
// Implementação recursiva do método de ordenação QuickSort

package sorts;

import java.util.Arrays;

public class QuickSort implements GenericSortImplementation {

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

        executeSort(arrangement, 0, arrangementLength);
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
    private static <T extends Comparable<T>> void executeSort (T[] arrangement, int left, int right) {
        if (left < right) {
            int pivot = partition(arrangement, left, right);
            executeSort(arrangement, left, pivot - 1);
            executeSort(arrangement, pivot, right);
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

    /**
     *
     * Método helper que compara o elemento de arranjo v com um arranjo w e indica o menor deles
     *
     * @param v subparte do arranjo que será verificado
     * @param w outra subparte do arranjo que será verificado
     *
     * @return boolean
     * */
    static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    /**
     *
     * Método helper que efetua a troca de dois elementos do arranjo em dadas posições
     *
     * @param arrangement arranjo que será efetuado a troca dos elementos
     * @param idx elemento atual da troca
     * @param idy elemento que será efetuado a troca
     *
     * @return boolean
     * */
    static <T> boolean swap(T[] arrangement, int idx, int idy){
        T swap = arrangement[idx];
        arrangement[idx] = arrangement[idy];
        arrangement[idy] = swap;
        return true;
    }

    /**
     *
     * Método helper simplesmente exibe um arranjo
     *
     * @param arrangement arranjo que será exibido
     *
     * @return void
     * */
    static void show (Object[] arrangement){
        System.out.println(Arrays.toString(arrangement));
    }
}
