package kyu7;

import static org.junit.Assert.*;

import org.example.kyu7.SumOfOddNumbers;
import org.junit.Test;

public class SumOfOddNumbersTest {

    @Test
    public void test1() {
        assertEquals(1, SumOfOddNumbers.rowSumOddNumbers(1));
        assertEquals(125, SumOfOddNumbers.rowSumOddNumbers(5));
        assertEquals(74088, SumOfOddNumbers.rowSumOddNumbers(42));

    }
}