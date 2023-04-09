package com.goit;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSumWithOne() {
        int value = 1;
        int actual = sumCalculator.sum(1);
        assertEquals(value, actual);
        System.out.println(actual);
    }

    @Test
    void testSumWithThree() {
        int value = 6;
        int actual = sumCalculator.sum(3);
        assertEquals(value, actual);
    }

    @Test
    void testSumWithZero() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }

}
