package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Станислав on 28.09.2015.
 */
public class Plane implements Flyable {

    private int numOfPeople;

    @Override
    public void fly() {

    }

    public Plane(int numOfPeople) {

        this.numOfPeople = numOfPeople;
    }


}
