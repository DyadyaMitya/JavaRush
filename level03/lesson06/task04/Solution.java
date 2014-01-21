package com.javarush.test.level03.lesson06.task04;
import java.io.File;

/* Путь к файлу java.exe
Выведи на экран текст: полное имя файла java.exe из установленного пакета java
*/

public class Solution {
    public static void main(String[] args) {
        String javaHome = System.getProperty("java.home");
        File f = new File(javaHome);
        f = new File(f, "bin");
        f = new File(f, "java.exe");
        System.out.println(f);
    }
}
