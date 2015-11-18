package com.javarush.test.level08.lesson11.home09;


import java.text.SimpleDateFormat;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "AUG 19 1991";
        System.out.println(isDateOdd(s));

    }

    public static boolean isDateOdd(String date)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("D");
        Date startDate = new Date(date);
        if(Integer.parseInt(dateFormat.format(startDate))%2 == 1)
            return true;
        else
            return false;
    }
}
