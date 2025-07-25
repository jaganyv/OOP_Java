package Enums;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day : ");
        String response = scanner.nextLine().toUpperCase();
            try {
                Day day = Day.valueOf(response);
                switch (day) {
                    case MONDAY,
                         TUESDAY,
                         WEDNESDAY,
                         THURSDAY,
                         FRIDAY -> System.out.println("Its a Weekday");
                    case SATURDAY,
                         SUNDAY,
                         PIZZADAY -> System.out.println("Its a WeekEnd.");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Please Enter an Valid Day...");
            }
        }
    }

