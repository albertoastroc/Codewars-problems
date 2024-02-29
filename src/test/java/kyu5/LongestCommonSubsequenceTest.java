package kyu5;


import org.example.kyu5.LongestCommonSubsequence;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class LongestCommonSubsequenceTest {
    @Test
    public void exampleTests() {
        assertEquals("", LongestCommonSubsequence.lcs("a", "b"));
        assertEquals("abc", LongestCommonSubsequence.lcs("abcdef", "abc"));
        assertEquals("nottest", LongestCommonSubsequence.lcs("anothertest", "notatest"));
        assertEquals("12356", LongestCommonSubsequence.lcs("132535365", "123456789"));
    }
}