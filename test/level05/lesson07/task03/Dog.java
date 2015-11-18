package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{       String name;
        int length;
        String color;
    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int length){
        this.name = name;
        this.length = length;

    }
    public void initialize(String name, int length, String color){

        this.name = name;
        this.length = length;
        this.color = color;
    }


}
