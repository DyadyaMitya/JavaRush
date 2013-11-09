public class MultiplicationTable
{

    /* Таблица умножения
    Выведи на экран надпись: таблицу умножения 10 на 10:
    1 2 3 …
    2 4 6 …
    3 6 9 …
    …
    */
    public static void main(String[] args) {

        for (int i=1; i<=10; i++)
        {
            for(int j=1; j<=10; j++)
            {
                System.out.print((i*j)+" ");
            }
            System.out.println("");
        }

    }





}