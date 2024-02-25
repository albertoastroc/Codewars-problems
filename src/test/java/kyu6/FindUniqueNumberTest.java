package kyu6;

import org.example.kyu6.FindUniqueNumber;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class FindUniqueNumberTest {
    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, FindUniqueNumber.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindUniqueNumber.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }
}