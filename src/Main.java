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
        System.out.println("Задание 2");
        for (int f = 5; f < 31; f = f + 7) {
            System.out.println("Сегодня пятница " + f + " число, необходимо подготовить отчёт");
        }
        System.out.println("Задание 3");
        for (int y = 1896; y < 2122; y = y + 79) {
            System.out.println(y);
            }

    }
}