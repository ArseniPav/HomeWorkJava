import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class LinkFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для поиска URL, заканчивающихся на .com:");
        String text = scanner.nextLine();

        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.com\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные ссылки:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
