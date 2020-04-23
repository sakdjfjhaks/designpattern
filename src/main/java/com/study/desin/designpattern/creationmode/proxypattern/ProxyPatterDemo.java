package com.study.desin.designpattern.creationmode.proxypattern;

public class ProxyPatterDemo {
    public static void main(String[] args){

        ProxyPattern proxyPattern = new ProxyPattern("ppp.mp3");

        proxyPattern.display();
        System.out.print("");

        proxyPattern.display();

    }
}
