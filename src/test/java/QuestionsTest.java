import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class QuestionsTest {

    @Test
    public void returnQuestion() {
        Questions question = new Questions();
        String str1 = question.returnQuestion(0)[0];
        assertEquals("Which one among these is not a primitive datatype?", str1);
        String str2 = question.returnQuestion(1)[1];
        assertEquals("Swing", str2);
        String str3 = question.returnQuestion(2)[3];
        assertEquals("net", str3);
        String str4 = question.returnQuestion(3)[1];
        assertEquals("lang", str4);
        String str5 = question.returnQuestion(4)[4];
        assertEquals("jtek", str5);
    }
}