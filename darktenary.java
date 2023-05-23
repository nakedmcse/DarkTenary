public class darktenary {
    public static String getDayOfWeek(int dayNumber) {
        return dayNumber == 0 
        ? "Sunday"
        : dayNumber == 1
        ? "Monday"
        : dayNumber == 2
        ? "Tuesday"
        : dayNumber == 3
        ? "Wednesday"
        : dayNumber == 4
        ? "Thursday"
        : dayNumber == 5
        ? "Friday"
        : dayNumber == 6
        ? "Saturday"
        : "Invalid Day Number";
    }

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(3));
        System.out.println(getDayOfWeek(10));
    }
}