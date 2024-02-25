package kyu7;

import org.example.kyu7.YoureASquare;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class YoureASquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, YoureASquare.isSquare(-1));
        assertEquals("0 is a square number (0 * 0)",    true,   YoureASquare.isSquare(0));
        assertEquals("3 isn't a square number", false,  YoureASquare.isSquare(3));
        assertEquals("4 is a square number (2 * 2)",    true,   YoureASquare.isSquare(4));
        assertEquals("25 is a square number (5 * 5)",   true,   YoureASquare.isSquare(25));
        assertEquals("26 isn't a square number",false,  YoureASquare.isSquare(26));
    }
}