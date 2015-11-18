package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String d = reader.readLine();
        int z = Integer.parseInt(a);
        int x = Integer.parseInt(b);
        int q = Integer.parseInt(c);
        int w = Integer.parseInt(d);
        if (z > x && z > q && z > w )
            System.out.println(z);
        else if (x > z && x > q && x > w)
            System.out.println(x);
        else if (q > z && q > x && q > w)
            System.out.println(q);
        else if (w > z && w > x && w > q)
            System.out.println(w);
    }







    }

