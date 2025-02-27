
public class ArrayApp {
    public static int min_value(int[] array) {  //En küçük değeri bulma
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max_value(int[] array) { //EN büyük değeri bulma
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double average_value(int[] array) { //  ortalamayı bulma
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            double average = sum / array.length;
        }
        return (double) sum / array.length;
    }
}






