package com.genesis.exams.slot.impl;

import com.genesis.exams.slot.Symbol;

class Symbols {
    private static final String A = "A";
    private static final String B = "B";
    private static final String C = "C";
    private static final String X = "X";
    private static final String Y = "Y";
    private static final String Z = "Z";

    private Symbols() {}

    static Symbol getA(){
       return new Symbol(A,1);
    }

    static Symbol getB(){
        return new Symbol(B,1);
    }

    static Symbol getC(){
        return new Symbol(C, 1);
    }

    static Symbol getX(){
        return new Symbol(X,2);
    }

    static Symbol getY(){
        return new Symbol(Y, 3);
    }

    static Symbol getZ(){
        return new Symbol(Z, 4);
    }
}
