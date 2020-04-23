package com.study.desin.designpattern.creationmode.proxypattern;

public class ProxyPattern implements Image {
    private RealImage realImage;
    private String fileName;
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

    public ProxyPattern(String fileName) {
        this.fileName = fileName;
    }

    public RealImage getRealImage() {
        return realImage;
    }

    public void setRealImage(RealImage realImage) {
        this.realImage = realImage;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
