package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put((double)12,"Стас");
        labels.put(12.3,"sd");
        labels.put((double)125,"wqeСтас");
        labels.put(122.3,"asd");
        labels.put((double)123,"dsСтас");
    }


    public static void main(String[] args) {
        System.out.println(labels);


    }
}
