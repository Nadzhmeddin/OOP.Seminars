package Seminar_5;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void testSum() {
        Calculator calculator = new Calculator();
        int actualSum = calculator.sum(2,2); // фактическое значение 4
        int expectedSum = 4; // ожидаемый результат

        Assertions.assertEquals(expectedSum,actualSum);

    }
    @org.junit.jupiter.api.Test
    void testSum2() {
        Calculator calculator = new Calculator();
        int actualSum = calculator.sum(3,5); // фактическое значение 4
        int expectedSum = 8; // ожидаемый результат

        Assertions.assertEquals(expectedSum,actualSum);
    }
}