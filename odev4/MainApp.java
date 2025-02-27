public class MainApp {
    public static void main(String[] args) {
        double[][] matrix1 = {{1, 2}, {3, 4}};
        double[][] matrix2 = {{5, 6}, {7, 8}};

        MatrixApp mat1 = new MatrixApp(matrix1);
        MatrixApp mat2 = new MatrixApp(matrix2);

        MatrixApp sum = mat1.add(mat2);
        MatrixApp difference = mat1.subtract(mat2);
        MatrixApp product = mat1.multiply(mat2);

        System.out.println("Toplama:");
        sum.printMatrix();

        System.out.println("Çıkarma:");
        difference.printMatrix();

        System.out.println("Çarpma:");
        product.printMatrix();



    }

}
