import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {
    private static final String DATE_PATTERN = "^(\\d{4})/(\\d{2})/(\\d{2}) (\\d{2}):(\\d{2})$";

    public static boolean isValidDate(String dateString) {
        Pattern pattern = Pattern.compile(DATE_PATTERN);
        Matcher matcher = pattern.matcher(dateString);

        if (!matcher.matches()) {
            return false;
        }

        int year = Integer.parseInt(matcher.group(1));
        int month = Integer.parseInt(matcher.group(2));
        int day = Integer.parseInt(matcher.group(3));

        if (year < 1000 || year > 2012) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        return day >= 1 && day <= 30;
    }

    public static void main(String[] args) {
        System.out.println(isValidDate("2012/09/18 12:10"));
        System.out.println(isValidDate("2012/24/18 12:10"));
    }
}
