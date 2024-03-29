package kyu7;

import org.example.kyu7.ComplementaryDNA;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class ComplementaryDNATest {
    @Test
    public void test01() {
        assertEquals("TTTT", ComplementaryDNA.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
        assertEquals("TAACG", ComplementaryDNA.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
        assertEquals("CATA", ComplementaryDNA.makeComplement("GTAT"));
    }
}