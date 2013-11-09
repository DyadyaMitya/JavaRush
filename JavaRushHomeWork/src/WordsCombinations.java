import java.util.Arrays;


public class WordsCombinations
{
    //Выводит все комбинации слов - по 1, по 2, по 3 слова в линию и т.д.
    /*
    public static void main(String[] args)
    {
        c = Arrays.asList("Мама","Мыла","Раму").toArray(new String[0]);
        permutation(0);
    }

    static String[] c;

    static void swap(int pos1, int pos2)
    {
        String temp = c[pos1];
        c[pos1] = c[pos2];
        c[pos2] = temp;
    }

    public static void permutation(int start)
    {
        if (start != 0)
        {
            for (int i = 0; i < start; i++)
                System.out.print(c[i]);
            System.out.println();
        }

        for (int i = start; i < c.length; i++)
        {
            swap(start, i);
            permutation(start + 1);
            swap(start, i);
        }
    }
        */


    // Выводит комбинации по n слов (n - количество слов в массиве)
    static void showPermutations(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                //System.out.println(list.substring(1,list.length()-1));  //выводит элементы без [], через запятые

                //Этот вариант убирает скобки, запятые и пробелы
                String list = Arrays.toString(arr)
                        .replace(",", "")
                        .replace("[", "")
                        .replace(" ", "")
                        .replace("]", "");
                System.out.println(list);

                //Перемешиваем
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