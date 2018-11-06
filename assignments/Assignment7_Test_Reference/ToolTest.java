import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToolTest {

    private Scissors s = new Scissors(5);
    private Paper p = new Paper(7);
    private Rock r = new Rock(15);

    @Test
    void setStrength() {
        assertEquals(5, s.strength);
        s.setStrength(4);
        assertEquals(4, s.strength);
    }

    @Test
    void fight() {
        assertEquals(true, s.fight(p));
        assertEquals(false, p.fight(s));
        assertEquals(false, p.fight(r));
        assertEquals(true, r.fight(p));
        assertEquals(true, r.fight(s));
        assertEquals(false, s.fight(r));
    }
}