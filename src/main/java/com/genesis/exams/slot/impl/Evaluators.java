package com.genesis.exams.slot.impl;

import com.genesis.exams.slot.Evaluator;
import com.genesis.exams.slot.Symbol;

import java.util.HashMap;
import java.util.Map;

public class Evaluators implements Evaluator {
    private static final Evaluator instance = new Evaluators();

    private static final Map<String, Integer> map = new HashMap<>();

    static {
        map.put("AAA", 20);
        map.put("BBB", 20);
        map.put("CCC", 20);
        map.put("ABC", 30);
    }

    private Evaluators(){}

    public static Evaluator getEvaluator() {
        return instance;
    }

    /**
     *
     * @param symbols resulting symbols from a spin
     * @param bet placed for the spin
     * @return Payout
     */

    @Override
    public long evaluate(Symbol[] symbols, long bet) {
        if (symbols == null || symbols.length != 3) {
            throw new IllegalArgumentException("symbols not allow");
        }

        if (bet <0) {
            throw new IllegalArgumentException("bet not allow");
        }

        String symbolName = getS(symbols);

        if (map.containsKey(symbolName)) {
            return map.get(symbolName)*bet;
        }else {
            return 0;
        }
    }

    private String getS(Symbol[] symbols) {
        StringBuilder result = new StringBuilder();

        for (Symbol symbol : symbols) {
            if (symbol == null) {
                throw new IllegalArgumentException("symbol not allow");
            }
            result.append(symbol.getName());
        }

        return result.toString();
    }
}
