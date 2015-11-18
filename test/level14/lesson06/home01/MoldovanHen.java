package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Станислав on 04.06.2015.
 */

public class MoldovanHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
};