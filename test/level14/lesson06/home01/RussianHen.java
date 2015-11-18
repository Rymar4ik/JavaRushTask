package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Станислав on 04.06.2015.
 */

public class RussianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA +  ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
};
