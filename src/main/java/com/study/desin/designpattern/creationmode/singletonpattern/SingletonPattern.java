package com.study.desin.designpattern.creationmode.singletonpattern;

public class SingletonPattern {
    private SingletonPattern(){

    }

    /**
     * 枚举类型是线程安全的，并且只会装载一次
     */
    private enum Singleton{
        INSTANCE;

        private final SingletonPattern instance;

        Singleton(){
            instance = new SingletonPattern();
        }

        private SingletonPattern getInstance(){
            return instance;
        }
    }

    public static SingletonPattern getInstance(){

        return Singleton.INSTANCE.getInstance();
    }
    void showMessage(){
        System.out.print("SingletonPattern");
    }
}
