public class Questions {

    String[] q1 = {"Which one among these is not a primitive datatype?", "int", "Float", "boolean", "char"};
    String[] q2 = {"Which class is available to all the class automatically?", "Swing", "Applet", "Object", "ActionEvent"};
    String[] q3 = {"Which package is directly available to our class without importing it?", "Swing", "Applet", "net", "lang"};
    String[] q4 = {"String class is defined in which package?", "lang", "Swing", "Applet", "awt"};
    String[] q5 = {"Which institute is best for java coaching?", "Utek", "Aptech", "SSS IT", "jtek"};
    String[] q6 = {"Which one among these is not a keyword?", "class", "int", "get", "if"};


    public String[] returnQuestion(int question_id) {
        String[] noValue = new String[5];
        if (question_id == 0) {
            return q1;
        } else if (question_id == 1) {
            return q2;
        } else if (question_id == 2) {
            return q3;
        } else if (question_id == 3) {
            return q4;
        } else if (question_id == 4) {
            return q5;
        } else if (question_id == 5) {
            return q6;
        }

        else return noValue;

    }
}