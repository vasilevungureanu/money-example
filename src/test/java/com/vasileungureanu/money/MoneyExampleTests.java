package com.vasileungureanu.money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyExampleTests {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);

        five.times(2);

        assertEquals(10, five.amount);
    }
}
