package com.javarush.test.level08.lesson08.task04;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Арно", new Date("January 19 1991"));
        map.put("Лето",new Date("February 14 1993"));
        map.put("Kli", new Date("March 12 1964"));
        map.put("Арноль", new Date("April 19 1991"));
        map.put("Летошок",new Date("May 14 1993"));
        map.put("Klint", new Date("June 12 1976"));
        map.put("Нольдик", new Date("July 19 1992"));
        map.put("Летоко",new Date("August 14 1996"));
        map.put("Fint", new Date("September 12 1985"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {

            Map.Entry<String, Date> pair = iterator.next();
            Integer month = pair.getValue().getMonth();
            if(month == 5 || month == 6 || month == 7)
                iterator.remove();
        }
    }


    public static void main(String[] args) {

        HashMap<String,Date > date = createMap();
        removeAllSummerPeople(date);
        for (Map.Entry<String,Date> test  : date.entrySet()) {
            System.out.println(test.getKey() + " " + test.getValue());

        }


    }
}
