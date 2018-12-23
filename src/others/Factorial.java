// Jr Silva 20/12/2018
// Implementação simples de um método recursivo para retornar o fatorial de um número n

package others;

public class Factorial {

    /**
     *
     * Testes simples da classe
     *
     * */
    public static void main (String... args) {
        System.out.println(factorial(5));
    }

    /**
     * Método fatorial recursivo
     *
     * @param n O número alvo que será calculado o seu fatorial
     *
     * @return long int
     */
    public static long factorial (int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }
}
