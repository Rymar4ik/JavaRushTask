package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listNum = new ArrayList<Integer>();
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        Integer max = Integer.MIN_VALUE;


        for (int i = 0 ; i < 5; i ++)
        {
                listNum.add(Integer.parseInt(reader.readLine()));
        }

        for (int j = 0; j < 5; j++)
        {

                for (int i = 0; i < listNum.size() ;i++)
              {
                if(listNum.get(i) >= max)
                    max = listNum.get(i);

              }

            finalList.add(0, max);
            listNum.remove(max);
            max =  Integer.MIN_VALUE;
        }


        for (int i = 0 ; i < finalList.size(); i++)
            System.out.println(finalList.get(i));
    }
}
