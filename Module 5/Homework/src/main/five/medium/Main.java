package five.medium;

import five.easy.DayOfWeek;

import java.util.ArrayList;
import java.util.List;

/*1. Создайте ArrayList<DayOfWeek> и добавьте в него все дни недели.

2. Выведите список всех дней недели в консоль.

3. Реализуйте метод isWeekend(DayOfWeek day), который
принимает день недели и возвращает true, если это суббота или воскресенье.*/
public class Main {

    public static boolean isWeekend(DayOfWeek day) {
        if (day.equals(DayOfWeek.SATURDAY) || day.equals(DayOfWeek.SUNDAY)) {
            return true;
        }
        else {
            return false;
    }
}
    public static void main(String[] args) {
        List<DayOfWeek> week = new ArrayList<>();
        week.add(DayOfWeek.MONDAY);
        week.add(DayOfWeek.TUESDAY);
        week.add(DayOfWeek.WEDNESDAY);
        week.add(DayOfWeek.THURSDAY);
        week.add(DayOfWeek.FRIDAY);
        week.add(DayOfWeek.SATURDAY);
        week.add(DayOfWeek.SUNDAY);

        for (DayOfWeek d : week) {
            System.out.println(d);
        }

        System.out.println();
        System.out.println(isWeekend(DayOfWeek.MONDAY));
        System.out.println(isWeekend(DayOfWeek.SATURDAY));
        System.out.println(isWeekend(DayOfWeek.SUNDAY));

    }


}
