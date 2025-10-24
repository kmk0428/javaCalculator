import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ScientificCalculatorTest {
    ScientificCalculator scientificCalc;
    @BeforeEach
    void setUp() {
        scientificCalc = new ScientificCalculator();
        scientificCalc.setNumbers(9, 3);
    }

    @Test
    void exponentiation() {
        assertEquals(729, scientificCalc.exponentiation());
    }
}