package Enums;

public enum Day {
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7),PIZZADAY(8);
    private int dayNumber;

    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }
}
