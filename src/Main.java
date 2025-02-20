public class Main {
    public static void main(String[] args) {
        DayOfWeek[] values = DayOfWeek.values();

        DayOfWeek dayOfWeekByNumber = getDayOfWeekByNumber(values, 7);
        System.out.println(dayOfWeekByNumber);
    }

    private static DayOfWeek getDayOfWeekByNumber(DayOfWeek[] values, int number) {
        for (DayOfWeek day : values) {
            if (day.getNumber() == number) {
                return day;
            }
        }
        return null;
    }
}