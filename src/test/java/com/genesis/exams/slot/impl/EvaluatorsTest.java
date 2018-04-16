package com.genesis.exams.slot.impl;

import com.genesis.exams.slot.Evaluator;
import com.genesis.exams.slot.Symbol;
import org.junit.Before;
import org.junit.Test;

public class EvaluatorsTest {

    private Evaluator evaluator;

    @Before
    public void setUp() {
        evaluator = Evaluators.getEvaluator();
    }

    @Test
    public void evaluateAAA() throws Exception {
        Symbol[] symbols = new Symbol[3];
        symbols[0] = Symbols.getA();
        symbols[1] = Symbols.getA();
        symbols[2] = Symbols.getA();

        assert evaluator.evaluate(symbols, 10) == 200;
    }

    @Test
    public void evaluateBBB() throws Exception {
        Symbol[] symbols = new Symbol[3];
        symbols[0] = Symbols.getB();
        symbols[1] = Symbols.getB();
        symbols[2] = Symbols.getB();

        assert evaluator.evaluate(symbols, 10) == 200;

    }

    @Test
    public void evaluateCCC() throws Exception {

        Symbol[] symbols = new Symbol[3];
        symbols[0] = Symbols.getC();
        symbols[1] = Symbols.getC();
        symbols[2] = Symbols.getC();

        assert evaluator.evaluate(symbols, 10) == 200;
    }

    @Test
    public void evaluateABC() throws Exception {
        Symbol[] symbols = new Symbol[3];
        symbols[0] = Symbols.getA();
        symbols[1] = Symbols.getB();
        symbols[2] = Symbols.getC();

        assert evaluator.evaluate(symbols, 10) == 300;
    }

    @Test
    public void evaluateCBA() throws Exception {
        Symbol[] symbols = new Symbol[3];
        symbols[0] = Symbols.getC();
        symbols[1] = Symbols.getB();
        symbols[2] = Symbols.getA();

        assert evaluator.evaluate(symbols, 10) == 0;


    }

    //todo add more test case, although there are some way could add all test case, it will be good to implement individually

}