package org.example;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulationTest {
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("BeforeEach");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @org.junit.jupiter.api.Test
    void getFirstLettersInUpperCase() {
        StringManipulation stringManipulation = new StringManipulation();
        assertEquals("ABC", stringManipulation.getFirstLettersInUpperCase("apple banana cherry"));
        assertEquals("H", stringManipulation.getFirstLettersInUpperCase("hello"));
        assertEquals("", stringManipulation.getFirstLettersInUpperCase(""));
        System.out.println("Test");
    }
}