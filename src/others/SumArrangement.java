package others;

public class SumArrangement {

    public static void main (String... args) {
        int[] arr = {3, 4, 10};

        System.out.println(sumArrangement(arr, 0));
    }

    /**
     * Método recursivo para somar os números de um arranjo
     *
     * @param arrangement Arranjo que será efetuado a busca
     * @param i indice do inicio do arranjo
     * @return o somatório do arranjo
     */
    private static int sumArrangement (int[] arrangement, int i) {
        int arrangementLength = arrangement.length;

        if (i < arrangementLength)
            return arrangement[i] + sumArrangement(arrangement, i + 1);

        return 0;
    }
}
