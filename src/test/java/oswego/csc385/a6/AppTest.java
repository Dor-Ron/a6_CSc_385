package oswego.csc385.a6;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest {
    Integer p, c, i;
    JosephusCircle jc1, jc2, jc3;
    Thread a1, a2, a3;

    @Before
    public void setUp() {
        p = null; c = null; i = null;
        jc1 = null; jc2 = null; jc3 = null;
        a1 = null; a2 = null; a3 = null;
    }

    @Test
    public void t0() {
        p = 1;
        c = 1;
        i = 1;

        jc1 = new Algorithm1(p, c, i);
		jc2 = new Algorithm2(p, c, i);
		jc3 = new Algorithm3(p, c, i);
		
		a1 = new Thread(jc1);
		a2 = new Thread(jc2);
        a3 = new Thread(jc3);
        
        a1.run();
		a2.run();
        a3.run();
        
        assertEquals(jc1.lastManStanding, 1);
        assertEquals(jc2.lastManStanding, 1); // This one fails, alg returns 0 instead of 1
        assertEquals(jc3.lastManStanding, 1);
    }
}
