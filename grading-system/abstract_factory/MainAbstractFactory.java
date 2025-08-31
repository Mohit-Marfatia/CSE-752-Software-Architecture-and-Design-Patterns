package abstract_factory;

import abstract_factory.interfaces.ExamFactory;
import abstract_factory.factories.*;

public class MainAbstractFactory {
    public static void main(String[] args) {
        ExamFactory[] factories = {new GATEExamFactory(), new JEEExamFactory()};
        
        String[][] responses = {
            { "Gate-MCQ", "Gate-FILLIN", "Gate-ESSAY", "Gate-TRUEFALSE", "Gate-CODING" },
            { "JEE-MCQ", "JEE-FILLIN", "JEE-ESSAY", "JEE-TRUEFALSE", "JEE-CODING" }
        };

        for (int i = 0; i < factories.length; i++) {
            ExamFactory factory = factories[i];
            factory.createMCQEvaluator().evaluate(responses[i][0]);
            factory.createFillInEvaluator().evaluate(responses[i][1]);
            factory.createEssayEvaluator().evaluate(responses[i][2]);
            factory.createTrueFalseEvaluator().evaluate(responses[i][3]);
            factory.createCodingEvaluator().evaluate(responses[i][4]);
        }
    }
}
