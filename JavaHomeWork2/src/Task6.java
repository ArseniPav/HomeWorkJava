import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.println("Введите строку: ");
            inputString = scanner.nextLine();
        } while (inputString.isEmpty());

        System.out.println("Введите символ для замены (a): ");
        char a = scanner.next().charAt(0);
        System.out.println("Введите символ, на который нужно заменить (b): ");
        char b = scanner.next().charAt(0);

        String resultString = inputString.replace(a, b);

        System.out.println("Результат: " + resultString);
    }
}
