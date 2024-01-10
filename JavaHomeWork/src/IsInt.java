import java.util.Scanner;
public class IsInt {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");

            int n = scanner.nextInt();

            if (n % 2 == 0) {
                System.out.println("Число " + n + " является чётным");
            } else {
                System.out.println("Число " + n + " является нечётным");
            }
        }
    }
