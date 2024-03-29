package tinfb4.eportfolio.tdd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc;
    private double deltaPrecisionLoss = 0.0000001;

    //region All tests for "add()" go in here
    @Test
    public void add_zeroAndZero_shouldBeZero() {
        double a = 0;
        double b = 0;
        double expected = 0;

        calc = new Calculator();
        double actual = calc.add(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void add_oneAndZero_shouldBeOne() {
        double a = 1;
        double b = 0;
        double expected = 1;

        calc = new Calculator();
        double actual = calc.add(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void add_oneAndZeroPointFive_shouldBeOnePointFive() {
        double a = 1;
        double b = 0.5;
        double expected = 1.5;

        calc = new Calculator();
        double actual = calc.add(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void add_twoAndThree_shouldBeFive() {
        double a = 2;
        double b = 3;
        double expected = 5;

        calc = new Calculator();
        double actual = calc.add(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void add_minusTwoAndMinusThree_shouldBeMinusFive() {
        double a = -2;
        double b = -3;
        double expected = -5;

        calc = new Calculator();
        double actual = calc.add(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void add_onePointTwoAndThree_shouldBeFourPointTwo() {
        double a = 1.2;
        double b = 3;
        double expected = 4.2;

        calc = new Calculator();
        double actual = calc.add(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void add_onePointTwoAndFivePointTwoFive_shouldBeSixPointFourFive() {
        double a = 1.2;
        double b = 5.25;
        double expected = 6.45;

        calc = new Calculator();
        double actual = calc.add(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void add_onePointThreeAndOnePointThree_shouldBeTwoPointSix() {
        double a = 1.3;
        double b = 1.3;
        double expected = 2.6;

        calc = new Calculator();
        double actual = calc.add(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }
    //endregion

    //region All tests for "sub()" go in here
    @Test
    public void sub_zeroAndZero_shouldBeZero() {
        double a = 0;
        double b = 0;
        double expected = 0;

        calc = new Calculator();
        double actual = calc.sub(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void sub_zeroAndZero_shouldBeZero() {
        double a = 1.3;
        double b = 0.6;
        double expected = 0.6;

        calc = new Calculator();
        double actual = calc.sub(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }
    //endregion

    //region All tests for "mul()" go in here
    @Test
    public void mul_zeroAndZero_shouldBeZero() {
        double a = 0;
        double b = 0;
        double expected = 0;

        calc = new Calculator();
        double actual = calc.mul(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void mul_zeroAndOne_shouldBeZero() {
        double a = 0;
        double b = 1;
        double expected = 0;

        calc = new Calculator();
        double actual = calc.mul(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void mul_zeroAndPointFive_shouldBeZero() {
        double a = 0;
        double b = 0.5;
        double expected = 0;

        calc = new Calculator();
        double actual = calc.mul(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void mul_pointFiveAndOne_shouldBePointFive() {
        double a = 0.5;
        double b = 1;
        double expected = 0.5;

        calc = new Calculator();
        double actual = calc.mul(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void mul_twoAndThree_shouldBeSix() {
        double a = 2;
        double b = 3;
        double expected = 6;

        calc = new Calculator();
        double actual = calc.mul(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void mul_twoPointOneAndThree_shouldBeSixPointThree() {
        double a = 2.1;
        double b = 3;
        double expected = 6.3;

        calc = new Calculator();
        double actual = calc.mul(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void mul_negativeAndPositive_shouldBeNegative() {
        double a = -1;
        double b = 1;
        double expected = -1;

        calc = new Calculator();
        double actual = calc.mul(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }

    @Test
    public void mul_negativeAndNegative_shouldBePositive() {
        double a = -1;
        double b = -1;
        double expected = 1;

        calc = new Calculator();
        double actual = calc.mul(a,b);

        assertEquals(expected,actual,deltaPrecisionLoss);
    }
    //endregion

    //region All tests for "div()" go in here

    //endregion
}