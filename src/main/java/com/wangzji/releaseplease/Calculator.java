package com.wangzji.releaseplease;

/**
 * Simple calculator for demonstration
 */
public class Calculator {
    
    /**
     * Add two integers
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtract two integers
     * @param a first number
     * @param b second number
     * @return difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Calculate modulo operation
     * @param a dividend
     * @param b divisor
     * @return remainder of a divided by b
     * @throws IllegalArgumentException if divisor is zero
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return a % b;
    }
    
    /**
     * Multiply two integers
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Divide two numbers
     * @param a dividend
     * @param b divisor
     * @return quotient of a divided by b
     * @throws IllegalArgumentException if divisor is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return (double) a / b;
    }
    
    /**
     * Calculate power of a number
     * Fixed: Handle negative exponents properly
     * @param base the base number
     * @param exponent the exponent
     * @return base raised to the power of exponent
     */
    public double power(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }
        
        if (exponent < 0) {
            // Fixed: Properly handle negative exponents
            return 1.0 / power(base, -exponent);
        }
        
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
} 