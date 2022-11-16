package com.java_config;

public class Writer {

    public Pen pen;

//    Constructor based injection

    public Writer(Pen pen) {
        this.pen = pen;
    }

    public void write(){
        pen.write();
    }

    public Pen getPen() {
        return pen;
    }

//    Setter based injection
    public void setPen(Pen pen) {
        this.pen = pen;
    }
}
