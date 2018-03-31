package com.fpinki.inh;

public class InhPCTest {
    public static void main(String[] args) {
        Parent p = new Child();
        p.parentMethod();
        // Type casting
        if ( p instanceof Child) {
            ((Child) p).childMethod();
        }

        Child c = new Child();
        c.childMethod();
        c.parentMethod();

    }
}
