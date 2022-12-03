import java.util.Random;
import java.util.RandomAccess;

public class Main {
    public static void main(String[] args) {
        int[] array = arrayRandom(30);

        // Задание 1
        System.out.println("Задание 1");
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        // Задание 2
        System.out.println("Задание 2");
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");

        // Задание 3
        System.out.println("Задание 3");
        System.out.println("Средняя сумма трат за месяц составила " + sum / array.length + " рублей.");

        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }

    public static int[] arrayRandom(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }
}