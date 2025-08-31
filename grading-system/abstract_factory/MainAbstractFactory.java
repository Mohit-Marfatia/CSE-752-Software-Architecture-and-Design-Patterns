package abstract_factory;

import abstract_factory.interfaces.ExamFactory;
import abstract_factory.factories.*;

public class MainAbstractFactory {
    public static void main(String[] args) {
        ExamFactory[] factories = {new GATEExamFactory(), new JEEExamFactory(), new CATExamFactory()};
        String[] difficulties = {"Easy", "Medium", "Hard", "Expert", "Advanced"};
        
        String[][] responses = {
            { "Gate-MCQ", "Gate-FILLIN", "Gate-ESSAY", "Gate-TRUEFALSE", "Gate-CODING" },
            { "JEE-MCQ", "JEE-FILLIN", "JEE-ESSAY", "JEE-TRUEFALSE", "JEE-CODING" },
            { "CAT-MCQ", "CAT-FILLIN", "CAT-ESSAY", "CAT-TRUEFALSE", "CAT-CODING" }
        };

        for (int i = 0; i < factories.length; i++) {
            ExamFactory factory = factories[i];
            factory.createMCQEvaluator(difficulties[0]).evaluate(responses[i][0]); 
            factory.createFillInEvaluator(difficulties[1]).evaluate(responses[i][1]); 
            factory.createEssayEvaluator(difficulties[2]).evaluate(responses[i][2]); 
            factory.createTrueFalseEvaluator(difficulties[3]).evaluate(responses[i][3]);
            factory.createCodingEvaluator(difficulties[4]).evaluate(responses[i][4]); 
        }
    }
}