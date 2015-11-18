package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> copyList = new ArrayList<String>();
        for (int i = 0; i < 5 ; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }


        for (int i = 0; i < 5 ; i++)
            copyList.add(list.get(list.size() - i - 1));


        list = null;


        for (int i = 0; i < 5 ; i++)
            System.out.println(copyList.get(i));

    }
}
