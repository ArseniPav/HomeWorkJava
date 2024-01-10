public class FindSum {
    public static void main(String[] args) {
        int a = 8;
        int b = 47;
        int c = 19;

        int sum = sumOfTwoNumbers(a, b, c);
        System.out.println("Сумма двух наибольших чисел: " + sum);
    }

    public static int sumOfTwoNumbers(int x, int y, int z) {
        if (x > y) {
            if (y > z) {
                return x + y;
            } else {
                return x + z;
            }
        } else {
            if (x > z) {
                return x + y;
            } else {
                return y + z;
            }
        }
    }
}
