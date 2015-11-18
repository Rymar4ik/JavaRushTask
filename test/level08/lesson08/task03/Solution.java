package com.javarush.test.level08.lesson08.task03;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
       HashMap<String, String> people = new HashMap<String, String>();
        people.put("Rymars", "Stanislav");
        people.put("Rymar", "Katerina");
        people.put("Likhtars","Daria");
        people.put("Likhtar","Katya");
        people.put("Letoshko", "Artur");
        people.put("Pinchyk","Alexandr");
        people.put("Gorodnyi","Timur");
        people.put("Rymarsa", "Stanislav");
        people.put("Likhtarsa","Daria");
        people.put("Letoshkos", "Artur");

        return people;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {   int counter = 0;
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String needname = pair.getValue();
            if (needname.equals(name))
                counter++;

        }
        return counter;
    }


    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int counter = 0;
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            String thirdname = pair.getKey();
            if(thirdname.equals(familiya))
                counter++;
        }
    return counter;
    }

    public static void main(String[] args) {

        HashMap<String,String> test = createMap();
        System.out.println(getCountTheSameFirstName(test,"Rymar"));
        System.out.println(getCountTheSameFirstName(test,"Daria"));
        System.out.println(getCountTheSameLastName(test,"Rymar"));
        System.out.println(getCountTheSameLastName(test,"Daria"));
    }


}
