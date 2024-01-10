public class LeapYear {
    public static void main(String[] args) {
        int year = 2023;
        System.out.println(year + " год содержит " + getDaysInYear(year) + " дней.");
    }

    public static int getDaysInYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366;
        } else {
            return 365;
        }
    }
}
