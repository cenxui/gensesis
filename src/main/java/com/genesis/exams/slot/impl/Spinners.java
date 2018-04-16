package com.genesis.exams.slot.impl;

import com.genesis.exams.slot.Reel;
import com.genesis.exams.slot.Spinner;
import com.genesis.exams.slot.Symbol;


public class Spinners implements Spinner {
    private static final Spinner instance = new Spinners();

    private Spinners() {}

    /**
     * get Spinner
     * @return the spinner instance
     */
    public static Spinner getSpinner() {
        return instance;
    }

    /**
     * spin the reel of SlotMachine
     * @param reel the reel owns by SlotMachine
     * @return the symbol after spin
     */

    @Override
    public Symbol spin(Reel reel) {

        int result = (int)(Math.random() * 12);

        if (result <1) {
            return Symbols.getA();
        }else if (result <2) {
            return Symbols.getB();
        }else if (result <3) {
            return Symbols.getC();
        }else if (result < 5) {
            return Symbols.getX();
        }else if (result < 8) {
            return Symbols.getY();
        }else {
            return Symbols.getZ();
        }
    }
}
