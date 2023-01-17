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
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();


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
        for (int a = 1; a < 11; a++) {
            int b = a * 2;
            System.out.println("2*" + a + "=" + b);
        }
    }

    public static void task11() {
        System.out.println("Задача 11");
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            total = total + salary;
            total = total + total / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            i = i + 1;
        }
    }

    public static void task12() {
        System.out.println("Задача 12");
        int a = 1;
        while (a < 10) {
            System.out.print(a);
            a = a + 1;
        }
        System.out.println(a);
        for (int b = 10; b > 0; b = b - 1) {
            System.out.print(b);
        }
    }

    public static void task13() {
        System.out.println("Задача 13");
        int population = 12000000;
        int roZd = 17;
        int smEr = 8;
        int a = roZd - smEr;
        for (int i = 1; i <= 10; i++) {
            population += population * a / 1000;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }

    }

    public static void task14() {
        System.out.println("Задача 14");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 12_000_000) {
            total = total + salary;
            total = total + total / 100 * 7;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task15() {
        System.out.println("Задача 15");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 12_000_000) {
            total = total + total / 100;
            total = total + salary;
            i = i + 1;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task16() {
        System.out.println("Задача 16");
        int salary = 15000;
        int total = 0;
        int i = 1;
        for (i = 1; i <= 108; i++) {
            total = total + salary;
            total = total + total / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task17() {
        System.out.println("Задача 17");
        int i = 0;
        for (i = 0; i <= 31; i++) {
            if (i % 7 == 1)
                System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task18() {
        System.out.println("Задача 18");
        int a = 0;
        do {a+=79;}
        while (a<1822);
        while (a<=2122){
                System.out.println("Год появления кометы " + a);
                a+=79;
        }
    }
}






