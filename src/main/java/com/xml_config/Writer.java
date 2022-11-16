package com.xml_config;

public class Writer {

    public Pen pen;

//    Constructor based injection
//    Add constructor arg in .xml file
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
//    Add properties tag in .xml file
    public void setPen(Pen pen) {
        this.pen = pen;
    }
}
