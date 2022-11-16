package com.java_config;

public class FlairPen implements Pen {

    public Ink ink;

//    Constructor based injection
//    Add constructor arg in .xml file
    public FlairPen(Ink ink) {
        this.ink = ink;
    }

    @Override
    public void write() {
        System.out.println("We are using " + ink.getInk()+" and " +this.penName() );
    }

    @Override
    public String penName() {
        return "Flair Pen";
    }

    public Ink getInk() {
        return ink;
    }

//    Setter based injection
//    Add properties tag in .xml file
    public void setInk(Ink ink) {
        this.ink = ink;
    }
}
