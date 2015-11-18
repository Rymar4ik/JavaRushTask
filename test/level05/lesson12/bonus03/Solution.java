package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE ;

        if  (n > 0){

            for (int i = 0; i < n; i++)
        {
            int numAdd = Integer.parseInt(reader.readLine());
            if (numAdd > maximum)
                maximum = numAdd;
        }
            System.out.println(maximum);
        }



    }


    }

