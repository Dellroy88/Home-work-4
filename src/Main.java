import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int p = 0;
        while (p < 10) {
            p = p + 1;
            System.out.println("Цикл " + p);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println("Цикл " + i);
        }
        System.out.println("Задача 2");
        for (int f = 5; f < 31; f = f + 7) {
            System.out.println("Сегодня пятница " + f + " число, необходимо подготовить отчёт");
        }
        System.out.println("Задача 3");
        int currentYear = LocalDate.now().getYear();

        int start = currentYear - 200;
        int end = currentYear + 100;

        for (int year = start; year <= end; year++) {
            if (year % 79 == 0)
            System.out.println(year);
        }

    }
}