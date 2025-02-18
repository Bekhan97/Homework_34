public class Main {
    public static void main(String[] args) {
        DayOfWeek[] values = DayOfWeek.values();

        for (DayOfWeek dayOfWeek : values) {

            if (dayOfWeek.getNumber() == 2) {
                System.out.println(dayOfWeek);
            }
        }
    }
}