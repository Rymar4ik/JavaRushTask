package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(reader.readLine());
        FileOutputStream out = new FileOutputStream(reader.readLine());

            if(in.available() > 0){
                byte[] buffer = new byte[in.available()];
                int count = in.read(buffer);

                for (int i = buffer.length - 1 ; i >= 0 ; i--) {
                    out.write(buffer[i]);
                }
            }

        reader.close();
        in.close();
        out.close();

    }
}