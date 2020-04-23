package com.study.desin.designpattern.creationmode.factorypattern;

public class FactoryPatterDemo {
    public static void main(String []args){
        Shape shape = new ShapeFactory().getShape("circle");
        shape.draw();
    }
}
