package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/
import java.util.Arrays;

public class Solution
{
    static void showPermutations(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                //System.out.println(list.substring(1,list.length()-1));
                String list = Arrays.toString(arr)
                        .replace(",", "")
                        .replace("[", "") 
                        .replace(" ", "")
                        .replace("]", "");
                System.out.println(list);

                String tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"Мама","Мыла","Раму"};
        showPermutations(words);
    }
}
