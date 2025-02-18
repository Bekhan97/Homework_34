public class Main {
    public static void main(String[] args) {
        DayOfWeek[] values = DayOfWeek.values();

        getDayOfWeekByNumber(values, 7);
    }

    private static void getDayOfWeekByNumber(DayOfWeek[] values, int number) {
        for (DayOfWeek dayOfWeek : values) {
            if (dayOfWeek.getNumber() == number) {
                System.out.println(number + ". " + dayOfWeek.name());
            }
        }
    }
}