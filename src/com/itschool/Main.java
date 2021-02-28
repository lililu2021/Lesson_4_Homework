package com.itschool;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

//        Example_1();
//        Example_2();
//        Example_3();
//        Example_4();
//        Example_5();
//        Example_6();
//        Example_7();
//        Example_8();
        Example_9(); // в процессе разработки, не проверять


    }

    private static void Example_1() {
/*      В массиве хранится информация о численности книг в каждом из 35 разделов библиотеки.
        Выяснить, верно ли, что общее число книг в библиотеке - есть шестизначное число.*/

        int[] sections = new int[35];
        int summ = 0;
        Random random = new Random();
        for (int i = 0; i < sections.length; i++) {
            sections[i] = random.nextInt(5000);
            summ += sections[i];
        }
        System.out.println(Arrays.toString(sections));
        if (summ > 99999 && summ < 1_000_000) {
            System.out.println("Общее количество книг = " + summ + " - шестизначное число");
        } else {
            System.out.println("Общее количество книг = " + summ + " - не шестизначное число");
        }
    }

    private static void Example_2() {
/*      В массиве хранится информация о баллах, полученных спортсменом-десятиборцем в каждом
    из десяти видов спорта. Для выхода в следующий этап соревнований общая сумма баллов должна
    превысить некоторое известное значение.
        Определить, вышел ли данный спортсмен в следующий этап соревнований.*/

        final int score = 500;
        int summ = 0;
        int[] typeOfSport = new int[10];
        Random random = new Random();
        for (int i = 0; i < typeOfSport.length; i++) {
            typeOfSport[i] = random.nextInt(100);
            summ += typeOfSport[i];
        }
        System.out.println("Общая сумма набраных баллов - " + summ);
        if (summ >= score) {
            System.out.println("Спортсмен вышел в следующий этап");
        } else {
            System.out.println("Спортсмен не вышел в следующий этап");
        }
    }

    private static void Example_3() {
/*      Оценки, полученные спортсменом в соревнованиях по фигурному катанию (в баллах), хранятся в массиве из 18 элементов.
    В первых шести элементах записаны оценки по обязательной программе, с седьмого по двенадцатый — по короткой программе,
    в остальных — по произвольной программе.
        Выяснить, по какому виду программы спортсмен показал лучший результат.*/

        int[] scores = new int[18];
        int summCompulsoryProgram = 0;
        int summShortProgram = 0;
        int summFreeProgram = 0;
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            scores[i] = random.nextInt(50);
            summCompulsoryProgram += scores[i];
        }
        System.out.println("Общая сумма балов по обязательной программе - " + summCompulsoryProgram);
        for (int i = 7; i < 12; i++) {
            scores[i] = random.nextInt(50);
            summShortProgram += scores[i];
        }
        System.out.println("Общая сумма балов по короткой программе - " + summShortProgram);
        for (int i = 13; i < 18; i++) {
            scores[i] = random.nextInt(50);
            summFreeProgram += scores[i];
        }
        System.out.println("Общая сумма балов по свободной программе - " + summFreeProgram);
        if (summCompulsoryProgram > summShortProgram && summCompulsoryProgram > summFreeProgram) {
            System.out.println("Спортсмен показал лучший результат по обязательной программе");
        } else if (summShortProgram > summCompulsoryProgram && summShortProgram > summFreeProgram) {
            System.out.println("Спортсмен показал лучший результат по короткой программе");
        } else if (summFreeProgram > summCompulsoryProgram && summFreeProgram > summShortProgram) {
            System.out.println("Спортсмен показал лучший результат по свободной программе");
        }
    }

    private static void Example_4() {
/*      Написать программу определения в одномерном массиве вещественных чисел
    наибольшего количества последовательно расположенных положительных чисел.*/

        int Array[] = new int[20];
        int maxSumm = 0;
        int summ = 0;
        Random random = new Random();
        for (int number = 0; number < Array.length; number++) {
            Array[number] = -50 + random.nextInt(100);
            if (Array[number] > 0) {
                summ++;
            } else if (summ > maxSumm) {
                maxSumm = summ;
                summ = 0;
            }
        }
        System.out.println(Arrays.toString(Array));
        System.out.println("Наибольшее число последовательно расположенных положительных чисел = " + maxSumm);
    }

    private static boolean function(int number) {
        for (int n = 2; n <= Math.sqrt(number); n++) {
            if (number == 0 && number % n == 0) {
                return false;
            }
        }
        return true;
    }

    private static void Example_5() {
/*      Задан целочисленный массив размерности N.
    Есть ли среди элементов массива простые числа?
    Если да, то вывести номера этих элементов.*/

        int[] N = new int[50];
        Random random = new Random();
        for (int n_1 = 0; n_1 < N.length; n_1++) {
            N[n_1] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(N));
        for (int n_1 = 0; n_1 < N.length; n_1++) {
            if (function(N[n_1]))
                System.out.print(N[n_1] + " (" + n_1 + ")");
        }
    }

    private static void Example_6() {
/*      Дан массив, в котором все элементы различны. Заменить в нём нулём :
    а) максимальный элемент;
    б) минимальный элемент.*/

        int[] Array = new int[20];
        int max = 0, min = 0;
        Random random = new Random();
        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(100);
        }
        int a = Array[0];
        int b = Array[0];
        for (int n1 = 0; n1 < Array.length; n1++) {
            if (Array[n1] > a) {
                a = Array[n1];
                max = n1;
            } else if (Array[n1] < b) {
                b = Array[n1];
                min = n1;
            }
        }
        System.out.println(Arrays.toString(Array));
        Array[max] = 0;
        Array[min] = 0;
        System.out.println(Arrays.toString(Array));
    }


    private static void Example_7() {
/*      Заменить нулями все повторяющиеся элементы в массиве, оставив их первые вхождения,
    то есть в массиве должны остаться только разные элементы.*/

        int[] Array = new int[20];
        Random random = new Random();
        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(Array));
        for (int n1 = 1; n1 < Array.length; n1++) {
            for (int n2 = 2; n2 < n1 - 1; n2++) {
                if (Array[n1] == Array[n2]) {
                    Array[n1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(Array));
    }


    private static void Example_8() {
//      Заменить нулями :
/*//    а) все отрицательные элементы;

        int[] Array = new int[20];
        Random random = new Random();
        int a = 0;
        for (int i = 0; i < Array.length; i++) {
            Array[i] = -10 + random.nextInt(25);
        }
        System.out.println(Arrays.toString(Array));
        for (int n1 = 0; n1 < Array.length; n1++) {
            if (Array[n1] < 0) {
                Array[n1] = a;
                a = 0;
            }
        }
        System.out.println(Arrays.toString(Array));*/

/*//    б) все элементы, большие данного числа n;

        int[] Array = new int[20];
        Random random = new Random();
        int numberN = 5 + random.nextInt(20), a = 0;
        System.out.println("numberN = " + numberN);
        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(25);
        }
        System.out.println(Arrays.toString(Array));
        for (int n1 = 0; n1 < Array.length; n1++) {
            if (Array[n1] > numberN) {
                Array[n1] = a;
                a = 0;
            }
        }
        System.out.println(Arrays.toString(Array));*/

/*//    в) все элементы, начиная с n1-го по n2-й (n1 ≤ n2).

        int[] Array = new int[20];
        Random random = new Random();
        int n1 = random.nextInt(15);
        int n2 = n1 + random.nextInt(15);
        int a = 0;
        System.out.println("n1 = " + n1 + ", n2 = " + n2);

        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(30);
        }
        System.out.println(Arrays.toString(Array));
        for (int k = 0; k < Array.length; k++) {
            if (Array[k] >= n1 && Array[k] <= n2) {
                Array[k] = a;
                a = 0;
            }
        }
        System.out.println(Arrays.toString(Array));*/
    }

    private static void Example_9() { // в процессе разработки, не проверять
//      Дан массив целых чисел. Удалить из него:
//    а) все четные элементы, стоящие на нечетных местах;

        int[] Array = new int[20];
        Random random = new Random();
        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(20);
//            if () {
//            }
            }
        System.out.println(Arrays.toString(Array));
        System.out.println(Arrays.hashCode(Array));
    }



//    б) все элементы, кратные 3 или 5.


    }

