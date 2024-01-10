import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        System.out.println("Введите символ:");
        char inputChar = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputChar) {
                count++;
            }
        }

        System.out.println("Количество вхождений символа '" + inputChar + "' в строку: " + count);
    }
}
