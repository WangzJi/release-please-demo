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
        assertEquals(2.5, calculator.divide(5, 2), 0.001);
        assertEquals(-1.0, calculator.divide(-5, 5), 0.001);
        assertEquals(1.666, calculator.divide(-5, -3), 0.001);
    }
    
    @Test
    @DisplayName("Division by zero should throw exception")
    void testDivideByZero() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class, 
            () -> calculator.divide(5, 0)
        );
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
} 