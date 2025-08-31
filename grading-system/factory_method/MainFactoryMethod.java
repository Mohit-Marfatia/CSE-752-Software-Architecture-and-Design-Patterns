package factory_method;
import factory_method.interfaces.*;
import factory_method.factories.*;

public class MainFactoryMethod {
    public static void main(String[] args) {
        String[] exams = {"GATE", "JEE", "CAT"};
        String[] types = {"MCQ", "FILLIN", "ESSAY", "TRUEFALSE", "CODING"};

        String[][] responses = {
            { "Gate-MCQ", "Gate-FILLIN", "Gate-ESSAY", "Gate-TRUEFALSE", "Gate-CODING" },
            { "JEE-MCQ", "JEE-FILLIN", "JEE-ESSAY", "JEE-TRUEFALSE", "JEE-CODING" },
            { "CAT-MCQ", "CAT-FILLIN", "CAT-ESSAY", "CAT-TRUEFALSE", "CAT-CODING" }
        };

        for (int i = 0; i < exams.length; i++) {
            QuestionEvaluatorFactory factory = exams[i].equals("GATE") ? new GATEFactory() : exams[i].equals("JEE") ? new JEEFactory() : new CATFactory();
            for (int j = 0; j < types.length; j++) {
                QuestionEvaluator evaluator = factory.createEvaluator(types[j]);
                evaluator.evaluate(responses[i][j]);
            }
        }
    }
}
