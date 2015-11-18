package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int sum  = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        {
        for (;true;)
        {
            String iString = reader.readLine();

            if (iString.equals("сумма"))
            {
                System.out.println(sum);
                break;
            }
            else
            {
                int i = Integer.parseInt(iString);
                sum = sum + i;
            }
        }
        }
    }

}
