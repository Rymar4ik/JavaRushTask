package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int z = Integer.parseInt(a);
        int x = Integer.parseInt(b);
        int w = Integer.parseInt(c);
        if (z > x && z > w ) {
            System.out.println(z);
            if ( x > w)
            { System.out.println(x);
                System.out.println(w); }
            else
            {   System.out.println(w);
                System.out.println(x); }
            }






            if  (x > z && x > w)  {
                System.out.println(x);
                if (z > w)
                {
                    System.out.println(z);
                    System.out.println(w);}
                else
                {
                    System.out.println(w);
                    System.out.println(z); }
            }


             else {
             if  (w > z && w > x)
             {
                 System.out.println(w);
                 if (z > x)
                 {
                      System.out.println(z);
                      System.out.println(x);}
                   else
                 {
                       System.out.println(x);
                      System.out.println(z); }
                     }
            }



    }
}
