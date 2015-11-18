package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        Map<String ,String> map = new HashMap<String,String>();
        map.put("Навальский","Александр");
        map.put("Рымарио","Станислав");
        map.put("Пинчук","Александр");
        map.put("Летошко","Артур");
        map.put("Лихтар","Даша");
        map.put("Фонарь","Даша");
        map.put("Рымар","Катерина");
        map.put("Кулик","Алена");
        map.put("Пушкарь" ,"Алена");
        map.put("Пикабу","Алена");

        return (HashMap) map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String,String> mapCopyFirst = new HashMap<String, String>(map);
        HashMap<String,String> mapCopyThird = new HashMap<String,String>(map);

        for (Map.Entry<String,String> pair1 : mapCopyFirst.entrySet()) {
            String key = pair1.getKey();
            String value = pair1.getValue();
            mapCopyThird.remove(key);

            if (mapCopyThird.containsValue(value))

            removeItemFromMapByValue(map, value);

        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String , String> forTest = createMap();
        removeTheFirstNameDuplicates(forTest);
        for (Map.Entry<String,String> pair  : forTest.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());

        }

    }

}
