import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {

    @org.junit.jupiter.api.Test
    void set() {
        OnlineTest onlineTest = new OnlineTest("Test of java");
        onlineTest.set();
        Questions questions = new Questions();
        onlineTest.current = 0;
    }
}
