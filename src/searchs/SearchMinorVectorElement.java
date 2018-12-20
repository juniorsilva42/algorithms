package searchs;

public class SearchMinorVectorElement {

    public static void main (String... args) {
        int[] arr = {3, 5, 6, 7, 10, 12, 2, 16, 34};

        System.out.println(searchMinorVectorElement(arr, 0, arr.length - 1));
    }

    /**
     * Método de busca do menor elemento recursivo
     *
     * @param arrangement Arranjo que será efetuado a busca
     * @param start índice do inicio do arranjo
     * @param end índice do final do arranjo
     * @return O menor elemento do arranjo
     */
    private static int searchMinorVectorElement (int[] arrangement, int start, int end) {
        // Para caso-base da sub-rotina da recursão
        if (start == end)
            return arrangement[start];

        int left, right, middle;

        middle = (start + end) / 2;

        left = searchMinorVectorElement(arrangement, start, middle);
        right = searchMinorVectorElement(arrangement, middle + 1, end);

        if (left < right)
            return left;
        else
            return right;
    }
}
