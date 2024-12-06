import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(7, calculator.add(4, 3));
        assertEquals(10, calculator.add(-20, 10));
        assertEquals(35, calculator.add(25,10));
    }

    @Test
    void dif() {
        assertEquals(-3, calculator.dif(2, 5));
        assertEquals(-4, calculator.dif(1, 5));
        assertEquals(77, calculator.dif(78,1));
    }

    @Test
    void div() {
        assertEquals(3, calculator.div(6, 2));
        assertEquals(77, calculator.div(77,1));
        assertThrows(ArithmeticException.class, () -> calculator.div(6, 0));
    }

    @Test
    void times() {
        assertEquals(15, calculator.times(3, 5));
        assertEquals(18, calculator.times(6,3));
        assertEquals(0, calculator.times(89,0));
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        assertEquals(16, calculator.solver());
    }
}
