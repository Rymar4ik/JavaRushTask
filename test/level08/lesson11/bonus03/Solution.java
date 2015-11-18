package com.javarush.test.level08.lesson11.bonus03;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }



        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }


    }

    public static void sort(String[] array)
    {

        for (int i = 0; i < array.length ; i++) {

          String max = array[i];
          int imax = i;


          for (int j = i + 1; j < array.length; j++) {

              if (isGreaterThen(max, array[j])) {
                  max = array[j];
                  imax = j;
              }
          }

             if (i != imax){
                 String temp = array[i];
                 array[i] = max;
                 array[imax] = temp;

               }


      }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareToIgnoreCase(b) > 0;
    }
}
