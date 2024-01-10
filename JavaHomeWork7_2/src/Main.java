import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ФИО: ");
            String fullName = scanner.nextLine();
            System.out.print("Введите возраст: ");
            int age = scanner.nextInt();

            if (age < 0 || age > 100) {
                throw new IncorrectInfoException("Возраст некорректен", fullName, age);
            }
            if (fullName.length() > 200 || Pattern.matches(".*[.,!?&]+.*", fullName)) {
                throw new IncorrectInfoException("Данные ФИО некорректны", fullName, age);
            }

            System.out.println("ФИО и возраст введены корректно.");
        } catch (IncorrectInfoException e) {
            System.err.println("Ошибка: " + e.getMessage());
            System.err.println("ФИО: " + e.getFullName() + ", Возраст: " + e.getAge());
            e.printStackTrace();
        }
    }
}
