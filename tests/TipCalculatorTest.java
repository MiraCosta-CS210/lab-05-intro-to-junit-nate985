import static org.junit.jupiter.api.Assertions.*;

public class TipCalculatorTest {
    @org.junit.jupiter.api.Test
    void addTest() {
        TipCalculator tipCalculator = new TipCalculator();

        //TEST SCENARIO 1
        //INPUTS: $100.00 bill, 20% tip
        //EXPECTED OUTPUT: $20.00
        double result = tipCalculator.calculateTip(100.00, 20);
        assertEquals(20.00, result);

        //TEST SCENARIO 2
        //INPUTS: $150.25 bill, 15% tip
        //EXPECTED OUTPUT: $22.54
        double result2 = tipCalculator.calculateTip(150.25, 15);
        assertEquals(22.54, result2);

    }
}
