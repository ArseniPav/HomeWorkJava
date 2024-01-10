import java.util.regex.*;

public class FindStrings2 {
    public static void main(String[] args) {
        String input = "ab abab abab abababab abea";

        String regex = "ab+";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Найдено совпадение: " + matcher.group());
        }
    }
}
