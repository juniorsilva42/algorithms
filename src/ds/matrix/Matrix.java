package ds.matrix;

public class Matrix {

    private int[][] data;

    public int getRows () {
        if (this.data == null)
            return 0;

        return this.data.length;
    }

    public int getElement (int x, int y) {
        return this.data[x][y];
    }
}
