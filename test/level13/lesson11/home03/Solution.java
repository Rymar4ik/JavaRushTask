package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream inputStream = new FileInputStream(reader.readLine());

        while (inputStream.available() > 0){

            char i =(char)inputStream.read();
            System.out.print(i);

            if(i + 1 == 'S'){
                System.out.println("");
            }
        }

        inputStream.close();
        reader.close();
    }
}
