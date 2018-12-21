package others;

public class TransposeSquareMatrix {

    public static void main (String... args) {
        int matrix[][] = {
                {1, 2, 4},
                {7, 4, 14},
                {9, 22, 44},
        };

        transposeSquareMatrix(matrix);
        show(matrix);
    }

    /**
     * Método main que executa uma transposição de uma matriz n, onde o que é linha passa a ser coluna
     *
     * @param matrix matriz que será transposta
     * @return void
     */
    public static void transposeSquareMatrix (int[][] matrix) {
        int matrixLength = matrix.length;

        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < i; j++)
                exchange(matrix, i, j);
        }
    }

    /**
     * Método helper que efetua a troca das linhas pelas colunas
     *
     * @param matrix matriz que será transposta
     * @param i índice das linhas da matriz
     * @param j índice das colunas da matriz
     * @return void
     */
    private static void exchange (int[][] matrix, int i, int j) {
        int aux = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = aux;
    }

    /**
     * Método helper que exibe a matriz final
     *
     * @param matrix matriz que será mostrada em tela
     * @return void
     */
    private static void show (int[][] matrix) {
        int matrixLength = matrix.length;

        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.printf("%d\t", matrix[i][j]);

            System.out.println();
        }
    }
}
