package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Станислав on 10.06.2015.
 */
public class Computer
{
    private Mouse mouse;
    private Monitor monitor;
    private Keyboard keyboard;

    public Computer() {
        this.mouse = new Mouse();
        this.monitor = new Monitor();
        this.keyboard = new Keyboard();
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
}
