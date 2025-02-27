public class MainApp {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 3, 8},
                {4, 5, 6},
                {3, 4, 2}
        };

        int[] minArray = ArrayApp2D.matrix_rowmin(matrix); // matrix_rowmin metodunu çağırıyoruz

        // minArray'i yazdırmak için bir döngü kullanıyoruz
        for (int i = 0; i < minArray.length; i++) {
            System.out.println("Satır " + (i + 1) + " minimum değeri: " + minArray[i]);
        }
    }
}

