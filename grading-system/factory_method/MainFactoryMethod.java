import interfaces.*;
import factories.*;

public class MainFactoryMethod {
    public static void main(String[] args) {
        String[] exams = {"GATE", "JEE"};
        String[] types = {"MCQ", "FILLIN", "ESSAY", "TRUEFALSE"};

        String[][] responses = {
            { "Gate-MCQ", "Gate-FILLIN", "Gate-ESSAY", "Gate-TRUEFALSE" },
            { "JEE-MCQ", "JEE-FILLIN", "JEE-ESSAY", "JEE-TRUEFALSE" }
        };

        for (int i = 0; i < exams.length; i++) {
            QuestionEvaluatorFactory factory = exams[i].equals("GATE") ? new GATEFactory() : new JEEFactory();
            for (int j = 0; j < types.length; j++) {
                QuestionEvaluator evaluator = factory.createEvaluator(types[j]);
                evaluator.evaluate(responses[i][j]);
            }
        }
    }
}
