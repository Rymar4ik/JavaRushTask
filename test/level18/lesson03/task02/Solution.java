package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {




                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String fileName = reader.readLine();
                FileInputStream byteReader = new FileInputStream(fileName);

                int a = Byte.MAX_VALUE;

                while (byteReader.available() > 0){
                    int b = byteReader.read();

                    if(b < a){
                        a = b;
                    }
                }
                System.out.println(a);

                reader.close();
                byteReader.close();
            }
        }

