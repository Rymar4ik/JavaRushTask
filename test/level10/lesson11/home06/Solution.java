package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        boolean gender;
        int age;
        int weight;
        int height;
        String address;

        public  Human(String name){
            this.name = name;
            this.gender = false;
            this.age = 0;
            this.weight = 0;
            this.height = 0;
            this.address = "unknown";

        }

        public Human(String name, boolean gender){

            this.name = name;
            this.gender = gender;
            this.age = 0;
            this.weight = 0;
            this.height = 0;
            this.address = "unknown";
        }

        public Human(String name, boolean gender,int age){

            this.name = name;
            this.gender = gender;
            this.age = age;
            this.weight = 0;
            this.height = 0;
            this.address = "unknown";
        }

        public Human(String name, boolean gender,int age , int weight){

            this.name = name;
            this.gender = gender;
            this.age = age;
            this.weight = weight;
            this.height = 0;
            this.address = "unknown";
        }

        public Human(String name, boolean gender, int age, int weight, int height){

            this.name = name;
            this.gender = gender;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.address = "unknown";
        }

        public Human(String name, boolean gender, int age, int weight, int height, String address){

            this.name = name;
            this.gender = gender;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.address = address;
        }

        public Human(int age , int weight, int height,  boolean gender){

            this.name = "unknown";
            this.gender = gender;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.address = "unknown";
        }

        public Human(String name, boolean gender,String address){

            this.name = name;
            this.gender = gender;
            this.age = 0;
            this.weight = 0;
            this.height = 0;
            this.address = address;
        }

        public Human(int weight, int height){

            this.name = "unknown";
            this.gender = false;
            this.age = 0;
            this.weight = weight;
            this.height = height;
            this.address = "unknown";
        }

        public Human(int age , String address){
            this.name = "unknown";
            this.gender = false;
            this.age = age;
            this.weight = 0;
            this.height = 0;
            this.address = address;
        }
    }


}
