package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int q = Integer.parseInt(a);
        int w = Integer.parseInt(b);
        int e = Integer.parseInt(c);
            if ( q > w && q < e  )
                System.out.println(q);
            else if (q < w && q > e)
                System.out.println(q);
            else if ( w > q && w < e)
                System.out.println(w);
            else if (w < q && w > e )
                System.out.println(w);
            else if (e > w && e < q )
                System.out.println(e);
            else if (e < w && e > q )
                System.out.println(e);




            {





            }

    }
}
