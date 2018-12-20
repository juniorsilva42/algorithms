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

    private static int binarySearch (int[] arrangement, int element, int minor, int major) {
        int media = (minor + major) / 2;

        // Casos bases da recursão
        if (minor > major)
            return -1;

        if (arrangement[media] == element)
            return media;

        if (arrangement[media] < element)
            return binarySearch(arrangement, element, media + 1, major);
        else
            return binarySearch(arrangement, element, minor, media - 1);
    }
}
