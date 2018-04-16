package com.genesis.exams.slot.impl;

import com.genesis.exams.slot.Spinner;
import org.junit.Before;
import org.junit.Test;

public class SpinnersTest {
    private Spinner spinner;

    @Before
    public void setUp() throws Exception {
        spinner = Spinners.getSpinner();
    }

    @Test
    public void spin() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(spinner.spin(null).getName());
        }
    }

}