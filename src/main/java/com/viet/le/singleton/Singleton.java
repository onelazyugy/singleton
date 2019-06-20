package com.viet.le.singleton;

public class Singleton {
    private static Singleton instance = null;
    private String string;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
