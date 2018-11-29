import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class OnlineTestTest {

    @Test
    public void check() {
        OnlineTest onlineTest = new OnlineTest("Test of java");
        onlineTest.current = 0;
        onlineTest.jb[1].setSelected(true);
        assertTrue(onlineTest.check());
        onlineTest.jb[2].setSelected(true);
        assertFalse(onlineTest.check());

        onlineTest.current = 1;
        onlineTest.jb[2].setSelected(true);
        assertTrue(onlineTest.check());
        onlineTest.jb[4].setSelected(true);
        assertFalse(onlineTest.check());

        onlineTest.current = 2;
        onlineTest.jb[3].setSelected(true);
        assertTrue(onlineTest.check());
        onlineTest.jb[2].setSelected(true);
        assertFalse(onlineTest.check());
    }
}