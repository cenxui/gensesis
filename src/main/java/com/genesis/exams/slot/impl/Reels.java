package com.genesis.exams.slot.impl;

import com.genesis.exams.slot.Reel;
import com.genesis.exams.slot.Symbol;

public class Reels {
    private Reels(){}

    /**
     * @return the reel with symbol A,B,C,X,Y,Z
     */
    public static Reel getReelOne() {
        Symbol[] symbols = new Symbol[6];
        symbols[0] = Symbols.getA();
        symbols[1] = Symbols.getB();
        symbols[2] = Symbols.getC();
        symbols[3] = Symbols.getX();
        symbols[4] = Symbols.getY();
        symbols[5] = Symbols.getZ();
        return new Reel(symbols);
    }

    /**
     * @return the reel with symbol Z,Y,X,A,B,C
     */
    public static Reel getReelTwo() {
        Symbol[] symbols = new Symbol[6];
        symbols[0] = Symbols.getZ();
        symbols[1] = Symbols.getY();
        symbols[2] = Symbols.getX();
        symbols[3] = Symbols.getA();
        symbols[4] = Symbols.getB();
        symbols[5] = Symbols.getC();

        return new Reel(symbols);
    }

    /**
     * @return the reel with symbol A,B,C,X,Y,Z
     */
    public static Reel getReelThree() {
       return getReelOne();
    }
}
