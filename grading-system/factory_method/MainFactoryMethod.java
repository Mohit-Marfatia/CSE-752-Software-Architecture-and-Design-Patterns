package factory_method;
import factory_method.interfaces.*;
import factory_method.factories.*;

public class MainFactoryMethod {
    public static void main(String[] args) {
        String[] exams = {"GATE", "JEE", "CAT"}; // Added CAT
        String[] types = {"MCQ", "FILLIN", "ESSAY", "TRUEFALSE", "CODING"};
        String[] difficulties = {"Easy", "Medium", "Hard", "Expert", "Advanced"};

        String[][] responses = {
            { "Gate-MCQ", "Gate-FILLIN", "Gate-ESSAY", "Gate-TRUEFALSE", "Gate-CODING" },
            { "JEE-MCQ", "JEE-FILLIN", "JEE-ESSAY", "JEE-TRUEFALSE", "JEE-CODING" },
            { "CAT-MCQ", "CAT-FILLIN", "CAT-ESSAY", "CAT-TRUEFALSE", "CAT-CODING" }
        };

        for (int i = 0; i < exams.length; i++) {
            QuestionEvaluatorFactory factory;
            switch (exams[i]) {
                case "GATE": factory = new GATEFactory(); break;
                case "JEE": factory = new JEEFactory(); break;
                case "CAT": factory = new CATFactory(); break;
                default: throw new IllegalArgumentException("Invalid exam type");
            }
            
            for (int j = 0; j < types.length; j++) {
                QuestionEvaluator evaluator = factory.createEvaluator(types[j], difficulties[j]);
                evaluator.evaluate(responses[i][j]);
            }
        }
    }
}