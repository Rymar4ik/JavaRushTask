package com.javarush.test.level18.lesson03.task04;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
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
        FileInputStream fileReader = new FileInputStream(reader.readLine());
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        while (fileReader.available() > 0){
            int tmp = fileReader.read();
            if(map.containsKey(tmp)){
                int value = map.get(tmp);
                map.put(tmp,++value);
            }
            else map.put(tmp, 0);
        }

        reader.close();
        fileReader.close();

        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer,Integer> pair : map.entrySet()) {

                if(pair.getValue() < min){
                    min = pair.getValue();
                }
        }

        for(Map.Entry<Integer,Integer> pair : map.entrySet()){

                if(pair.getValue() == min){
                    System.out.println(pair.getKey() + " ");
                }
        }

    }
}
