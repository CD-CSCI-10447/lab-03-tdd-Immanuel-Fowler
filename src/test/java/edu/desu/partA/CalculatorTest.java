package edu.desu.partA;

import edu.desu.partA.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void addTest01(){
        //given
        Calculator calc = new Calculator();
        double inputX = 1;
        double inputY = 2;

        //when
        double expected = 3;
        double actual = calc.add(inputX, inputY);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addTest02(){
        //Given
        Calculator calc = new Calculator();
        double inputX = -75;
        double inputY = 4;

        // when
        double expected = -71;
        double actual = calc.add(inputX, inputY);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addTest03(){
        //Given
        Calculator calc = new Calculator();
        double inputX = 1;
        double inputY = 1;

        // when
        double expected = 2;
        double actual = calc.add(inputX, inputY);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subtractTest01(){
        Calculator calc = new Calculator();
        double x = -7;
        double y = 2;

        double expected = -9;
        double actual = calc.subtract(x,y);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void subtractTest02(){
        Calculator calc = new Calculator();
        double subX = 13;
        double subY = -7;

        double expected = 20;
        double actual = calc.subtract(subX, subY);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subtractTest03(){
        Calculator calc = new Calculator();
        double subX = 1;
        double subY = 1;

        double expected = 0;
        double actual = calc.subtract(subX, subY);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest01(){
        Calculator calc = new Calculator();
        double x = 0;
        double y = 0;

        double expected = 0;
        double actual = calc.subtract(x, y);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest02(){
        Calculator calc = new Calculator();
        double x = 8;
        double y = 1;

        double expected = 8;
        double actual = calc.subtract(x, y);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest03(){
        Calculator calc = new Calculator();
        double x = 10;
        double y = 100;

        double expected = 1000;
        double actual = calc.subtract(x, y);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideTest01(){
        Calculator calc = new Calculator();
        double x = 0;
        double y = 0;

        double expected = 1;
        double actual = calc.divide(x, y);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void divideTest02(){
        Calculator calc = new Calculator();
        double x = 10;
        double y = 2;

        double expected = 5;
        double actual = calc.divide(x, y);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void divideTest03(){
        Calculator calc = new Calculator();
        double x = 100;
        double y = 10;

        double expected = 10;
        double actual = calc.divide(x, y);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void absoluteValueTest01(){
        Calculator calc = new Calculator();
        double x = 10;

        double expected = 10;
        double actual = calc.absoluteValue(x);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void absoluteValueTest02(){
        Calculator calc = new Calculator();
        double x = -10;

        double expected = 10;
        double actual = calc.absoluteValue(x);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void absoluteValueTest03(){
        Calculator calc = new Calculator();
        double x = 0;

        double expected = 0;
        double actual = calc.absoluteValue(x);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arcSinTest01(){
        Calculator calc = new Calculator();
        double x = 0;

        double expected = Math.asin(x);
        double actual = calc.arcSin(x);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arcSinTest02(){
        Calculator calc = new Calculator();
        double x = 7;

        double expected = Math.asin(x);
        double actual = calc.arcSin(x);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arcSinTest03(){
        Calculator calc = new Calculator();
        double x = 89;

        double expected = Math.asin(x);
        double actual = calc.arcSin(x);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arcCosTest01(){
        Calculator calc = new Calculator();
        double x = 7;

        double expected = Math.acos(x);
        double actual = calc.arcCos(x);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arcCosTest02(){
        Calculator calc = new Calculator();
        double x = 9;

        double expected = Math.acos(x);
        double actual = calc.arcCos(x);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arcCosTest03(){
        Calculator calc = new Calculator();
        double x = 69;

        double expected = Math.acos(x);
        double actual = calc.arcCos(x);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arcTanTest01() {
        Calculator calc = new Calculator();
        double input = 0.5;
        double expected = Math.atan(input);
        double actual = calc.arcTan(input);
        assertEquals(expected, actual);
    }

    @Test
    public void arcTanTest02() {
        Calculator calc = new Calculator();
        double input = -0.5;
        double expected = Math.atan(input);
        double actual = calc.arcTan(input);
        assertEquals(expected, actual);
    }

    @Test
    public void arcTanTest03() {
        Calculator calc = new Calculator();
        double input = 0.0;
        double expected = Math.atan(input);
        double actual = calc.arcTan(input);
        assertEquals(expected, actual);
    }

    @Test
    public void sinTest01() {
        Calculator calc = new Calculator();
        double input = 0.5;
        double expected = Math.sin(input);
        double actual = calc.sin(input);
        assertEquals(expected, actual, 1.0E-15);
    }

    @Test
    public void sinTest02() {
        Calculator calc = new Calculator();
        double input = -0.5;
        double expected = Math.sin(input);
        double actual = calc.sin(input);
        assertEquals(expected, actual, 1.0E-15);
    }

    @Test
    public void sinTest03() {
        Calculator calc = new Calculator();
        double input = 0.0;
        double expected = Math.sin(input);
        double actual = calc.sin(input);
        assertEquals(expected, actual, 1.0E-15);
    }

    @Test
    public void cosTest01(){
        Calculator calc = new Calculator();
        double input = 1.0;
        double expected = Math.cos(input);
        double actual = calc.cos(input);
        assertEquals(expected, actual, 1.0E-15);
    }

    @Test
    public void cosTest02(){
        Calculator calc = new Calculator();
        double input = 2.0;
        double expected = Math.cos(input);
        double actual = calc.cos(input);
        assertEquals(expected, actual, 1.0E-15);
    }

    @Test
    public void cosTest03(){
        Calculator calc = new Calculator();
        double input = 3.0;
        double expected = Math.cos(input);
        double actual = calc.cos(input);
        assertEquals(expected, actual, 1.0E-15);
    }

    @Test
    public void tanTest01(){
        Calculator calc = new Calculator();
        double input = 0.0;
        double expected = Math.tan(input);
        double actual = calc.tan(input);
        assertEquals(expected, actual, 1.0E-15);
    }

    @Test
    public void tanTest02(){
        Calculator calc = new Calculator();
        double input = 2.0;
        double expected = Math.tan(input);
        double actual = calc.tan(input);
        assertEquals(expected, actual, 1.0E-15);
    }

    @Test
    public void tanTest03(){
        Calculator calc = new Calculator();
        double input = 6.0;
        double expected = Math.tan(input);
        double actual = calc.tan(input);
        assertEquals(expected, actual, 1.0E-15);
    }

    @Test
    public void sqRootTest01(){
        Calculator calc = new Calculator();
        double input = 6.0;
        double expected = Math.sqrt(input);
        double actual = calc.sqRoot(input);
        assertEquals(expected, actual, 1.0E-15);
    }

    @Test
    public void sqRootTest02(){
        Calculator calc = new Calculator();
        double input = 4.0;
        double expected = Math.sqrt(input);
        double actual = calc.sqRoot(input);
        assertEquals(expected, actual, 1.0E-15);
    }

    @Test
    public void sqRootTest03(){
        Calculator calc = new Calculator();
        double input = 68.0;
        double expected = Math.sqrt(input);
        double actual = calc.sqRoot(input);
        assertEquals(expected, actual, 1.0E-15);
    }

}
