package com.study.desin.designpattern.creationmode.proxypattern;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("displaying:"+fileName);
    }

    public void loadFromDisk() {
        System.out.println("loadFromDisk:" + fileName);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}

