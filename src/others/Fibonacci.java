// Jr Silva 20/12/2018
// Implementação simples de um método recursivo para retornar a série de um número n

package others;

public class Fibonacci {

    /**
     *
     * Testes simples da classe
     *
     * */
    public static void main (String... args) {

        for (int i = 1; i <= 10; i++)
            System.out.print(fibonacci(i) + " - ");
    }

    /**
     * Método recursivo que executa a série de fibonacci em um dado numero
     *
     * @param n número alvo para obter a série de fibonacci
     *
     * @return int
     */
    private static int fibonacci (int n) {
        if (n == 1 ||  n == 2)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
