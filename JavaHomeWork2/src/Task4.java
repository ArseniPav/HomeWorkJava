import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите N (размер массива): ");
        int N = scanner.nextInt();
        System.out.print("Введите A (начало диапазона): ");
        int A = scanner.nextInt();
        System.out.print("Введите B (конец диапазона): ");
        int B = scanner.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = A + random.nextInt(B - A + 1);
        }

        System.out.println("Исходный массив:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Отсортированный массив:");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
