//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class MainApp {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 1, 34, 79, 10};

        int min_value = ArrayApp.min_value(array);
        System.out.println("En küçük değer: " + min_value);

        int max_value = ArrayApp.max_value(array);
        System.out.println("En büyük değer: " + max_value);

        double average_value =ArrayApp.average_value(array);
        System.out.println("Dizideki terimlerin ortalaması: " + average_value);
    }
}
