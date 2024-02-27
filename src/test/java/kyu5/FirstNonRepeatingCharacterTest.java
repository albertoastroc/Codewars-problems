package kyu5;

import org.example.kyu5.FirstNonRepeatingCharacter;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNonRepeatingCharacterTest {
    @Test @DisplayName("Sample tests")
    void sampleTests() {
        assertEquals("a", FirstNonRepeatingCharacter.firstNonRepeatingLetter("a"), "For input \"a\"");
        assertEquals("t", FirstNonRepeatingCharacter.firstNonRepeatingLetter("streSS"), "For input \"streSS\"");
        assertEquals("-", FirstNonRepeatingCharacter.firstNonRepeatingLetter("moon-men"), "For input \"moon-men\"");
        assertEquals("",  FirstNonRepeatingCharacter.firstNonRepeatingLetter("moonmoon"), "For input \"moonmoon\"");
        assertEquals("L",  FirstNonRepeatingCharacter.firstNonRepeatingLetter("I Like To Take Candy From A Baby\""), "For input \"I Like To Take Candy From A Baby\"\"");
    }
}