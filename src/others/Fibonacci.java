package others;

public class Fibonacci {

    public static void main (String... args) {

        System.out.println(fibonacci(10));
    }

    /**
     * Método recursivo que executa a série de fibonacci em um dado numero
     *
     * @param n número alvo para obter a série de fibonacci
     * @return o número de fibonnaci de n
     */
    private static int fibonacci (int n) {
        if (n == 1 ||  n == 2)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
