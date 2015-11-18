package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12/*высота, см*/   /*длина хвоста, см )
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Dog pluttoDog = new Dog("Plutto",10,4);
        Dog spikeDog = new Dog("Spike",4,1);
        Cat tomCat = new Cat("Tom",10,3);
        Cat girlCat = new Cat("Lyly",7,3);

    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        String name;
        int muscul;
        int age;

        public Dog(String name, int muscul, int age)
        {
            this.name = name;
            this.muscul = muscul;
            this.age = age;
        }
    }

    public static class Cat
    {
        String name;
        int speed;
        int age;

        public Cat(String name, int speed , int age){
            this.name = name;
            this.speed = speed;
            this.age = age;
        }
    }


    //Напишите тут ваши классы

}
