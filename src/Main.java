public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int a = 1; a < 11; a = a + 1) {
            System.out.println("Итерация цикла " + a);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int a = 10; a > 0; a = a - 1) {
            System.out.println("Итерация цикла " + a);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int a = 0; a < 17; a = a + 2) {
            System.out.println("Итерация цикла " + a);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int a = 10; a > -11; a = a - 1) {
            System.out.println("Итерация цикла " + a);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int a = 1904; a < 2097; a = a + 4) {
            System.out.println(a + " год является высокосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int a = 7; a < 99; a = a + 7) {
            System.out.println("Итерация цикла " + a);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int a = 1; a < 513; a = a * 2) {
            System.out.println("Итерация цикла " + a);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            //total = total + total / 100;
            total = total + salary;
            total = total + total / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        for (int a = 1; a < 11; a ++) {
            int b=a*2;
            System.out.println("2*" + a +"=" + b);
        }
    }
}
