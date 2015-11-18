package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String patch = new String();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        patch = bufferedReader.readLine();
        bufferedReader.close();

        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new FileReader(patch));

        while(reader.ready()){

           int i = Integer.parseInt(reader.readLine());
            if (i%2 == 0) list.add(i);
        }

        reader.close();
        Collections.sort(list);


        for (int i : list)
        {

                System.out.println(i);
        }

    }
}
