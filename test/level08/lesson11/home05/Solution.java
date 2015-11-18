package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Пример ввода:
мама     мыла раму.
Пример вывода:
Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        char[] chars = line.toCharArray();

        if(chars[0] != ' ')
            chars[0] = Character.toUpperCase(chars[0]);

        for (int i = 0; i < chars.length;) {

            if (i + 1 == chars.length)
                if (chars[i] == ' ')
                    break;

            if(chars[i] == ' ' && chars[i + 1] != ' '){
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
                i++;}
            else
                i++;
        }

        String s = new String(chars);
        System.out.println(s);

    }

}




