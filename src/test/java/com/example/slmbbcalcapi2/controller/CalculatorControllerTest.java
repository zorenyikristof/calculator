package com.example.slmbbcalcapi2.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    @Test
    void addTwoPositiveIntegers() {
        //Arrange
        CalculatorController controller = new CalculatorController();
        int a = 5;
        int b = 7;

        //Act
        int result = controller.add(a, b);
        //Assert
        assertEquals(12, result);
    }
    @Test
    void addOnePositiveAndOneNegativeIntegers() {
        //Arrange
        CalculatorController controller = new CalculatorController();
        int a = -5;
        int b = 7;

        //Act
        int result = controller.add(a, b);
        //Assert
        assertEquals(2, result);
    }
}