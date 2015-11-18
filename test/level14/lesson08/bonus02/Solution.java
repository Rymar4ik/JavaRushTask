package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i0 = Integer.parseInt(reader.readLine());
        int i1 = Integer.parseInt(reader.readLine());
        System.out.println(getNod(i0,i1));



    }

    public static int getNod(int a, int b) {

        int tmp = 0;
        while (true) {

            if(a > b){

                tmp = a - b;

                if(tmp < a)
                    a = tmp;
                else
                    b = tmp;

            }
            else {
                tmp = b - a;

                if (tmp < a)
                    a = tmp;
                else
                    b = tmp;
            }

            if(a == b) break;
        }

        return tmp;
    }



}
