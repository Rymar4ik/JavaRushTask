package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "мама", "мыла", "раму");

        for (int i = 0; i < list.size(); i++)
            if (list.get(i).equals("мама"))
                list.add(i + 1, "именно");
            else if(list.get(i).equals("мыла"))
                list.add(i + 1, "именно");
            else if (list.get(i).equals("раму"))
                list.add(i + 1, "именно");




        for (int i = 0; i < list.size();i++)
            System.out.println(list.get(i));
    }
}

