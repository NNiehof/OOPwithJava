
public class Main {

    public static void main(String[] args) {
        System.out.println(isAWeekDay("mon"));
        System.out.println(isAWeekDay("mal"));

        System.out.println(allVowels("aio"));
        System.out.println(allVowels("apple"));

        System.out.println(clockTime("23:59:01"));
        System.out.println(clockTime("26:33:71"));
    }

    public static boolean isAWeekDay(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        return false;
    }

    public static boolean allVowels(String string) {
        if (string.matches("[aeiouäö]+")) {
            return true;
        }
        return false;
    }

    public static boolean clockTime(String string) {
        if (string.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}")) {
            int hours = Integer.parseInt(string.substring(0, 2));
            int minutes = Integer.parseInt(string.substring(3, 5));
            int seconds = Integer.parseInt(string.substring(6, 8));

            if (hours < 24 & minutes < 60 & seconds < 60) {
                return true;
            }
        }
        return false;
    }
}
