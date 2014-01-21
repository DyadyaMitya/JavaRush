package com.javarush.test.level03.lesson04.task02;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
*/

public class Solution {
    public static void main(String[] args) {
        String name = new String("Марфа");
        String nameLine = new String();
        int i = 0;
        int n = 0;
        while (i < 10) {
            nameLine = nameLine + name + " ";
            i++;
        }
        while (n < 5) {
            System.out.println(nameLine);
            n++;
        }
    }
}
