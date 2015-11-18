package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {   int i = 0;
        int i1 = 0;
        while(i1 < 10 )
        {


        while (i < 9)
        {
            System.out.print("S");
            i++;
        }
            System.out.println("S");
            i1++;
            i = 0;
        }
    }
}
