package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import com.sun.org.apache.xpath.internal.SourceTree;

public class Solution
{
    public static void main(String[] args)
    {
        Human fatherFather = new Human("Павел",true, 76); //Написать тут ваш код
        Human fatherMother = new Human("Николай",false,75);
        Human motherFather = new Human("Полина",true , 76);
        Human motherMother = new Human("Нина",false,75);
        Human father = new Human("Петр",true,46,fatherFather,motherFather);
        Human mother = new Human("Ника",false,45,fatherMother,motherMother);
        Human kid1 = new Human("Роман",true,15,father,mother);
        Human kid2 = new Human("Рита",false,15,father,mother);
        Human kid3 = new Human("Руслан",true,16,father,mother);

        System.out.println(fatherFather.toString());
        System.out.println(fatherMother.toString());
        System.out.println(motherFather.toString());
        System.out.println(motherMother.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex ;
        int age;
        Human father;
        Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
                this.name = name;
                this.sex = sex;
                this.age = age;
                this.father = father;
                this.mother = mother;

        }

       public Human(String name, boolean sex, int age ){
                this.name = name;
                this.sex = sex;
                this.age = age;

       }

    }

}
