package others;

public class Factorial {

    public static void main (String... args) {
        System.out.println(factorial(5));
    }

    /**
     * Método fatorial recursivo
     *
     * @param n O número alvo que será calculado o seu fatorial
     * @return O fatorial do número
     */
    public static long factorial (int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }
}
