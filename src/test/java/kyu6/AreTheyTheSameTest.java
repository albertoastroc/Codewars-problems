package kyu6;

import static org.junit.Assert.*;

import org.example.kyu6.AreTheyTheSame;
import org.junit.Test;


public class AreTheyTheSameTest {

    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, AreTheyTheSame.comp(a, b));
    }
}