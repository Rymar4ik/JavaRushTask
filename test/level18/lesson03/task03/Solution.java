package com.javarush.test.level18.lesson03.task03;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        while (fileInputStream.available() > 0)
        {
         int tmp = fileInputStream.read();

            if(map.containsKey(tmp))
            {
                int value = map.get(tmp);
                map.put(tmp, ++value);
            }
            else map.put(tmp,0);
        }

        reader.close();
        fileInputStream.close();

        int max = 0;
        for (Map.Entry<Integer,Integer> tmp : map.entrySet()){

            if(tmp.getValue() > max )
                max = tmp.getValue();
        }

        for (Map.Entry<Integer,Integer> tmp : map.entrySet()){
            if(max == tmp.getValue()){
                System.out.print(tmp.getKey() +  " ");
            }
        }

    }

}
