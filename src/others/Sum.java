// Jr Silva 20/12/2018
// Implementação simples de um método recursivo para calcular o somatório de um número n

package others;

public class Sum {

    /**
     *
     * Testes simples da classe
     *
     * */
    public static void main (String... args) {
        System.out.println(sum(5));
    }

    /**
     * Método somatório recursivo
     *
     * @param n O número alvo que será calculado o seu somatório
     *
     * @return int
     */
    private static int sum (int n) {
        if (n == 0)
            return 0;

        return sum(n - 1) + n;
    }
}
