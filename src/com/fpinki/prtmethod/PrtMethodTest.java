package com.fpinki.prtmethod;

public class PrtMethodTest {
    public static void main(String[] args) {
        PrtMethodExample p = new PrtMethodExample();
        p.p();
        p.setAge(9);
        p.p();
        //PrtMethodExample p = new PrtMethodExample("Pinki");
        PrtMethodExample p1 = new PrtMethodExample("Rashmi", 27);
        p1.p();
        p.p();


    }

}
