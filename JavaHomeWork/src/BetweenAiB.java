public class BetweenAiB {
    public static void main(String[] args) {
        int A = 3;
        int B = 15;
        int count = 0;

        for (int i = B - 1; i > A; i--) {
            System.out.println(i);
            count++;
        }
        System.out.println("Количество чисел: " + count);
    }
}
