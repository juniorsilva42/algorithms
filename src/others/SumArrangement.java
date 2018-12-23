// Jr Silva 20/12/2018
// Implementação simples de um método recursivo para o somatório dos elementos de um arranjo A

package others;

public class SumArrangement {

    /**
     *
     * Testes simples da classe
     *
     * */
    public static void main (String... args) {
        int[] arr = {3, 4, 10};

        System.out.println(sumArrangement(arr, 0));
    }

    /**
     * Método recursivo para somar os números de um arranjo
     *
     * @param arrangement Arranjo que será efetuado a busca
     * @param i indice do inicio do arranjo
     *
     * @return int
     */
    private static int sumArrangement (int[] arrangement, int i) {
        int arrangementLength = arrangement.length;

        if (i < arrangementLength)
            return arrangement[i] + sumArrangement(arrangement, i + 1);

        return 0;
    }
}
