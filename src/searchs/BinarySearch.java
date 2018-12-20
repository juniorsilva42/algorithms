package searchs;

import java.util.Arrays;

public class BinarySearch {

    public static void main (String... args) {
        int[] arr = {3, 5, 6, 7, 10, 12, 1, 2, 16, 34};

         // {1, 2, 3, 5, 6, 7, 10, 12, 16, 34}

        Arrays.sort(arr);
        int resultado = binarySearchExecute(arr, 123);

        if (resultado < 0)
            System.out.println("Elemento não encontrado.");
        else
            System.out.println("Elemento encontrado na posição "+resultado);
    }

    public static int binarySearchExecute (int[] arrangement, int element) {
        int arrangementLength = arrangement.length - 1;
        return binarySearch(arrangement, element, 0, arrangementLength);
    }

    /**
     * Método recursivo de busca binária
     *
     * @param arrangement Arranjo que será efetuado a busca
     * @param element elemento que será buscado no arranjo
     * @param minor índice do inicio do arranjo
     * @param major índice do fim do arranjo
     * @return O menor elemento do arranjo
     */
    private static int binarySearch (int[] arrangement, int element, int minor, int major) {
        int middle = (minor + major) / 2;

        // Casos-base das sub-rotinas da recursão
        if (minor > major)
            return -1;

        if (arrangement[middle] == element)
            return middle;

        if (arrangement[middle] < element)
            return binarySearch(arrangement, element, middle + 1, major);
        else
            return binarySearch(arrangement, element, minor, middle - 1);
    }
}
