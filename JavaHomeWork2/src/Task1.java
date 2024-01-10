import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(90) + 10;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean isStrictlyIncreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }

        if (isStrictlyIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
