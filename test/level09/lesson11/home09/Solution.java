package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String,Cat> map = new HashMap<String, Cat>();
        map.put("Колян", new Cat("Колян"));
        map.put("Ирина", new Cat("Ирина"));
        map.put("Katya", new Cat("Katya"));
        map.put("1", new Cat("1"));
        map.put("2", new Cat("2"));
        map.put("3", new Cat("3"));
        map.put("4", new Cat("4"));
        map.put("5", new Cat("5"));
        map.put("6", new Cat("6"));
        map.put("7", new Cat("7"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> catSet = new HashSet<Cat>();

        Iterator<Map.Entry <String,Cat>> mapEntryIter = map.entrySet().iterator();

        while(mapEntryIter.hasNext()){

            Map.Entry<String, Cat> pair = mapEntryIter.next();
            catSet.add(pair.getValue());

        }

        return catSet;

    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
