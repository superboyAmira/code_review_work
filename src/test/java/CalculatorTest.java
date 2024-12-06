import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(1, 4));
    }

    @Test
    void dif() {
        assertEquals(5, calculator.dif(10, 5));
    }

    @Test
    void div() {
        assertEquals(5, calculator.div(25, 5));
    }

    @Test
    void times() {
        assertEquals(5, calculator.times(5, 1));
    }

    @Test
    void solver() {
        assertEquals(new Calculator().solver(2,0,1),-2);
    }
}
