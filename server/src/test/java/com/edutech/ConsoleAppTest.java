package com.edutech;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ConsoleAppTest {

    @Test
    public void testIsPrime() {
        Assertions.assertTrue(ConsoleApp.isPrime(7));
        Assertions.assertFalse(ConsoleApp.isPrime(10));
        Assertions.assertFalse(ConsoleApp.isPrime(1));
    }

    @Test
    public void testIsArmstrong() {
        Assertions.assertTrue(ConsoleApp.isArmstrong(153));
        Assertions.assertFalse(ConsoleApp.isArmstrong(123));
        Assertions.assertTrue(ConsoleApp.isArmstrong(9474));
    }

    @Test
    public void testGenerateFibonacciSeries() {
        List<Integer> expectedSeries = Arrays.asList(0, 1, 1, 2, 3, 5);
        assertEquals(expectedSeries, ConsoleApp.generateFibonacciSeries(0, 1, 6));

        expectedSeries = Arrays.asList(2, 3, 5, 8, 13);
        assertEquals(expectedSeries, ConsoleApp.generateFibonacciSeries(2, 3, 5));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, ConsoleApp.factorial(5));
        assertEquals(1, ConsoleApp.factorial(0));
        assertEquals(1, ConsoleApp.factorial(1));
    }

    @Test
    public void testGeneratePassword() {
        assertEquals("user123", ConsoleApp.generatePassword("user@example.com"));
        assertEquals("johndoe123", ConsoleApp.generatePassword("johndoe@example.org"));
    }
}