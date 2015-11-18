package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 1;
        int i2 = 1;
        int f = 10;


           while(i2 <= f)
       {


            while(i <= f)
            {
            System.out.print(i*i2);
            System.out.print(" ");
            i++;
            }
         System.out.println();
          i2++;
          i = 1;
       }

    }
}
