package others;

public class Sum {

    public static void main (String... args) {
        System.out.println(sum(5));
    }

    /**
     * Método somatório recursivo
     *
     * @param n O número alvo que será calculado o seu somatório
     * @return O somatório do número
     */
    private static int sum (int n) {
        if (n == 0)
            return 0;

        return sum(n - 1) + n;
    }
}
