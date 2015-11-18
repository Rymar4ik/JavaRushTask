package com.javarush.test.level08.lesson11.home06;

import java.util.ArrayList;
/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(new Human("kolya",true,13));
        children.add(new Human("katya",false,15));
        children.add(new Human("lera",false,18));

        ArrayList<Human> mother = new ArrayList<Human>();
        mother.add(new Human("ira", false, 36, children));

        ArrayList<Human> father = new ArrayList<Human>();
        father.add(new Human("sasha",true,35,children));

        ArrayList<Human> parentsMother = new ArrayList<Human>();
        parentsMother.add(new Human("petr ivanovich",true,70,mother));
        parentsMother.add(new Human("inna petrovna",false,67,mother));

        ArrayList<Human> parentFather = new ArrayList<Human>();
        parentFather.add(new Human("nikolay evgenevich",true,77,father));
        parentFather.add(new Human("katerina stanislavovna",false,78,father));

        for (Human s : children)
        {
            System.out.println(s);
        }

        for (Human s : father)
        {
            System.out.println(s);
        }

        for (Human s : mother)
        {
            System.out.println(s);
        }

        for (Human s : parentsMother)
        {
            System.out.println(s);
        }

        for (Human s : parentFather)
        {
            System.out.println(s);
        }

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = null;

        public Human(String name , boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public Human(String name, boolean sex , int age , ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}