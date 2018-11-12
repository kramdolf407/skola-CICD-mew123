import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionsTest {

    @Test
    void returnQuestion() {
        Questions question = new Questions();
        String str1 = question.returnQuestion(0)[0];
        assertEquals("Which one among these is not a primitive datatype?", str1);
        String str2 = question.returnQuestion(1)[1];
        assertEquals("Swing", str2);
        String str3 = question.returnQuestion(2)[3];
        assertEquals("net", str3);
    }
}