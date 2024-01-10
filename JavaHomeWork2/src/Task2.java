import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int lowerBound;
        int upperBound;

        while (true) {
            System.out.print("Введите размер массива: ");
            size = scanner.nextInt();
            if (size > 0) {
                break;
            }
            System.out.println("Размер массива должен быть положительным числом.");
        }

        while (true) {
            System.out.print("Введите нижнюю границу диапазона: ");
            lowerBound = scanner.nextInt();
            System.out.print("Введите верхнюю границу диапазона: ");
            upperBound = scanner.nextInt();

            if (lowerBound <= upperBound) {
                break;
            }
            System.out.println("Нижняя граница должна быть меньше или равна верхней.");
        }

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }

        System.out.print("Сгенерированный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
