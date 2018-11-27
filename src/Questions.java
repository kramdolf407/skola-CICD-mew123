public class Questions {

    String[] q1 = {"Which one among these is not a primitive datatype?", "int", "Float", "boolean", "char"};
    String[] q2 = {"Which class is available to all the class automatically?", "Swing", "Applet", "Object", "ActionEvent"};
    String[] q3 = {"Which package is directly available to our class without importing it?", "Swing", "Applet", "net", "lang"};
    String[] q4 = {"String class is defined in which package?", "lang", "Swing", "Applet", "awt"};
    String[] q5 = {"Which institute is best for java coaching?", "Utek", "Aptech", "SSS IT", "jtek"};
    String[] q6 = {"Which one among these is not a keyword?", "class", "int", "get", "if"};
    String[] q7 = {"What is 5 + 3? ", "8", "1", "4", "6"};
    String[] q8 = {"Is documentation good? ", "No", "Absolutely not", "Yes", "Don't know"};
    String[] q9 = {"What is used to define a block of code (body of loop, function etc.) in Python?", "Curly braces", "Parenthesis", "Indentation", "Quotation"};
    String[] q10 = {"Which one represents a single line comment in Java ?", "//Comment","/*comment*/","@comment","!comment"};
    String[] q11 = {"Which is the most fun programming language?", "C","Java","Python","Swift"};


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
        } else if (question_id == 6) {
            return q7;
        } else if (question_id == 7) {
            return q8;
        } else if (question_id == 8) {
            return q9;
        } else if (question_id == 9){
            return q10;
        } else if (question_id == 10){
            return q11;
        }

        else return noValue;
    }
}