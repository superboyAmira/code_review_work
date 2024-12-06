import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {

        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(100, calculator.add(50,50));

        assertEquals(5, calculator.add(1, 4));

    }

    @Test
    void dif() {

        assertEquals(-1, calculator.dif(2, 3));
        assertEquals(4, calculator.dif(2, -2));
        assertEquals(0, calculator.dif(50,50));

        assertEquals(5, calculator.dif(10, 5));

    }

    @Test
    void div() {

        assertEquals(2, calculator.div(4, 2));
        assertThrows(ArithmeticException.class, () -> calculator.div(4, 0));
        assertEquals(1, calculator.div(5,5));

        assertEquals(5, calculator.div(25, 5));

    }

    @Test
    void times() {

        assertEquals(6, calculator.times(2, 3));
        assertEquals(0, calculator.times(5,0));
        assertEquals(25, calculator.times(5,5));

        assertEquals(5, calculator.times(5, 1));

    }

    @Test
    void solver() {

        Calculator calculator = new Calculator();
        assertEquals(11, calculator.solver());

        assertEquals(new Calculator().solver(2,0,1),-2);

    }
}
