public enum DayOfWeek {
    MONDAY(1,"понедельник","monday"),
    TUESDAY(2,"вторник","tuesday"),
    WEDNESDAY(3,"среда","wednesday"),
    THURSDAY(4,"четверг","thursday"),
    FRIDAY(5,"пятница","friday"),
    SATURDAY(6,"суббота","saturday"),
    SUNDAY(7,"воскресенье","sunday");

    private int number;
    private String ruName;
    private String enName;

    DayOfWeek(int number, String ruName, String enName) {
        this.number = number;
        this.ruName = ruName;
        this.enName = enName;
    }

    public int getNumber() {
        return number;
    }

    public String getRuName() {
        return ruName;
    }

    public String getEnName() {
        return enName;
    }

    public void dayOfWeek(int number) {

    }

//    public abstract void print();
}

