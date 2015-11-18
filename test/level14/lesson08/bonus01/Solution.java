package com.javarush.test.level14.lesson08.bonus01;

import javax.security.sasl.SaslException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }



        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new StringIndexOutOfBoundsException());
        exceptions.add(new SocketException());
        exceptions.add(new SaslException());
        exceptions.add(new ProtocolException());
        exceptions.add(new InterruptedException());

    }
}
