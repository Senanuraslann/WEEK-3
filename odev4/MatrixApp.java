public class MatrixApp {
    private double[][] matrix;

    public MatrixApp(double[][] matrix) {
        this.matrix = matrix;
    }

    public MatrixApp add(MatrixApp other) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
        return new MatrixApp(result);
    }

    public MatrixApp subtract(MatrixApp other) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.matrix[i][j] - other.matrix[i][j];
            }
        }
        return new MatrixApp(result);
    }

    public MatrixApp multiply(MatrixApp other) {
        int rows = matrix.length;
        int cols = other.matrix[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < other.matrix.length; k++) {
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        return new MatrixApp(result);
    }

    public void printMatrix() {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


}