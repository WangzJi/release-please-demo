package com.wangzji.releaseplease;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Calculator class
 */
class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    @DisplayName("Addition should work correctly")
    void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-8, calculator.add(-5, -3));
    }
    
    @Test
    @DisplayName("Subtraction should work correctly")
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-10, calculator.subtract(-5, 5));
        assertEquals(-2, calculator.subtract(-5, -3));
    }
    
    @Test
    @DisplayName("Multiplication should work correctly")
    void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(-25, calculator.multiply(-5, 5));
        assertEquals(15, calculator.multiply(-5, -3));
        assertEquals(0, calculator.multiply(0, 5));
    }
    
    @Test
    @DisplayName("Division should work correctly")
    void testDivide() {
        assertEquals(1.666666666666667, calculator.divide(5, 3), 0.000000000000001);
        assertEquals(-1.0, calculator.divide(-5, 5), 0.000000000000001);
        assertEquals(1.666666666666667, calculator.divide(-5, -3), 0.000000000000001);
    }
    
    @Test
    @DisplayName("Division by zero should throw exception")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }
    
    @Test
    @DisplayName("Power should work correctly")
    void testPower() {
        assertEquals(8.0, calculator.power(2, 3), 0.000000000000001);
        assertEquals(1.0, calculator.power(5, 0), 0.000000000000001);
        assertEquals(0.25, calculator.power(2, -2), 0.000000000000001);
    }
    
    @Test
    @DisplayName("Modulo should work correctly")
    void testModulo() {
        assertEquals(2, calculator.modulo(10, 3));
        assertEquals(0, calculator.modulo(10, 5));
        assertEquals(1, calculator.modulo(7, 2));
        assertEquals(-1, calculator.modulo(-7, 3));
    }
    
    @Test
    @DisplayName("Modulo by zero should throw exception")
    void testModuloByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.modulo(10, 0));
    }
} 