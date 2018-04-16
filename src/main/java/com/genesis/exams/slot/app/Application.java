package com.genesis.exams.slot.app;

import com.genesis.exams.slot.Reel;
import com.genesis.exams.slot.SlotMachine;
import com.genesis.exams.slot.SpinResult;
import com.genesis.exams.slot.Symbol;
import com.genesis.exams.slot.impl.Evaluators;
import com.genesis.exams.slot.impl.Reels;
import com.genesis.exams.slot.impl.Spinners;

import java.util.Arrays;


public class Application {

    public static void main(String[] args) {
        Reel[] reels = new Reel[3];
        reels[0] = Reels.getReelOne();
        reels[1] = Reels.getReelTwo();
        reels[2] = Reels.getReelThree();

        SlotMachine machine = new SlotMachine(
                reels, Spinners.getSpinner(), Evaluators.getEvaluator());

        for (int i = 0; i < 1000; i++) {
            SpinResult result = machine.spin(100);
            System.out.println(result.getPayout());
            Arrays.stream(result.getSymbols()).map(Symbol::getName).forEach(System.out::print);
            System.out.println("========================================================");
        }
    }

}
