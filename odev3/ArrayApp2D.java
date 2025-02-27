//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        public class ArrayApp2D {
            public static int[] matrix_rowmin(int[][] matrix) {

                int[] minArray = new int[matrix.length]; // Bu dizide matristeki minimum değerler tutulacak

                for (int i = 0; i < matrix.length; i++) {

                    int min = matrix[i][0]; // Her satırın ilk elemanını minimum olarak kabul ediyoruz

                    for (int j = 1; j < matrix[i].length; j++) {
                        if (min > matrix[i][j]) {
                            min = matrix[i][j]; // i satır j sütun
                        }
                    }
                    minArray[i] = min; // İçerdeki for döngüsünden çıktıktan sonra yazılır çünkü içerde tutarsak her değiştiğinde ona atanacak
                }
                return minArray;
            }
        }



