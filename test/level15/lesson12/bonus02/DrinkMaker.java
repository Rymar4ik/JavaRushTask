package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Станислав on 28.09.2015.
 */
public abstract class DrinkMaker {

    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
