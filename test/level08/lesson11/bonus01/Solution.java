package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM",Locale.ENGLISH);
        Date date = new Date();

        for (int i = 0; i < 12 ; i++) {
            date.setMonth(i);
            if (line.equalsIgnoreCase(dateFormat.format(date))){
                System.out.println(line + " is " + (i + 1) + " month");
                break;
            }
        }
    }

}
