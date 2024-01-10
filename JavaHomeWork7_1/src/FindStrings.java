import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindStrings {
    public static void main(String[] args) {
        String input = "ahb acb aeb aeeb adcb axeb";
        String patternString = "a.b";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
