import org.example.kyu7.DisemvowelTrolls;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DisemvoweTrollsTest {
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!", DisemvowelTrolls.problem("This website is for losers LOL!")
        );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", DisemvowelTrolls.problem(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", DisemvowelTrolls.problem("What are you, a communist?"));
    }
}