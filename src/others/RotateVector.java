package others;

import java.util.Arrays;

public class RotateVector {

    public static void main (String... args) {

        int[] arr = {3, 5, 6, 7, 10, 12, 2, 16, 34};
        Arrays.sort(arr);

        rotateVector(arr, 4);

        System.out.println(Arrays.toString(arr));
    }

    /**
     * Método main que rotaciona um arranjo n vezes
     *
     * @param vector Arranjo que será rotacionado
     * @param n número de vezes que o arranjo será rotacionado
     * @return void
     */
    public static void rotateVector (int[] vector, int n) {
        while (n > 0) {
            moveOnRight(vector);
            n--;
        }
    }

    /**
     * Método helper que rotaciona um arranjo para direita
     *
     * @param vector Arranjo que será rotacionado
     * @return void
     */
    private static void moveOnRight (int[] vector) {
        int n = vector.length;
        int aux = vector[n - 1];
        int it = n - 1;

        while (it > 0) {
            vector[it] = vector[it - 1];
            it--;
        }

        vector[0] = aux;
    }
}
