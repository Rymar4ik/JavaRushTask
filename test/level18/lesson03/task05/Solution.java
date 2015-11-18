package com.javarush.test.level18.lesson03.task05;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader = new FileInputStream(reader.readLine());
        List<Integer> list = new ArrayList<Integer>();
        while (fileReader.available()> 0){
            int tmp = fileReader.read();
            if(!list.contains(tmp)){
                list.add(tmp);
            }
        }

        Collections.sort(list);

        for (int i : list){
            System.out.print(i + " " ) ;
        }

    }



}
