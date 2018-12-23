// Jr Silva 23/12/2018
// Implementação simples de manipulação e operações sobre matrizes

package ds.matrix;

public class Matrix {

    private int[][] data;

    /**
    *
    * Retorna o número de linhas de uma matriz
    *
    * @return int
    *
    * */
    public int getRows () {
        if (this.data == null)
            return 0;

        return this.data.length;
    }

    /**
     *
     * Retorna o número de colunas de uma matriz
     *
     * @return int
     *
     * */
    public int getColumns () {
        if (this.data == null)
            return 0;

        return this.data[0].length;
    }

    /**
     *
     * Obtém um elemento de uma matriz
     *
     * @param x indice da linha da matriz
     * @param y indice da coluna da matriz
     *
     * @return int
     *
     * */
    public int getElement (int x, int y) {
        return this.data[x][y];
    }

    /**
     *
     * Verifica se uma matriz passada é igual a instância dessa matriz
     *
     * @param other matriz que será comparada com esta matriz
     *
     * @return boolean
     *
     * */
    public boolean equals (Matrix other) {
        return this == other;
    }

    /**
     *
     * Exibe a matriz
     *
     * @return String
     *
     * */
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < getRows(); i++) {
            s.append("[ ");

            for (int j = 0; j < getColumns(); j++)
                s.append(this.data[i][j]).append(" ");

            s.append("]").append("\n");
        }

        return s.toString();
    }
}
