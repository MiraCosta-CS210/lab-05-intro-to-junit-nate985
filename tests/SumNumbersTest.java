import static org.junit.jupiter.api.Assertions.*;

public class SumNumbersTest {
    @org.junit.jupiter.api.Test
    void sumIsEvenTest()
    {
        SumNumbers sumNumbers = new SumNumbers();

        //TEST SCENARIO 1
        //INPUTS: 1, 1
        //EXPECTED OUTPUT: 1 (which represents "true" - meaning the sum of the two numbers is even)
        int result = sumNumbers.sumIsEven(1,1);
        assertEquals(1, result);

        //TEST SCENARIO 2
        //INPUTS: 1, 2
        //EXPECTED OUTPUT: 0 (which represents "false" - meaning the sum of the two numbers is odd)
        int result2 = sumNumbers.sumIsEven(1,2);
        assertEquals(0, result2);

    }
}
