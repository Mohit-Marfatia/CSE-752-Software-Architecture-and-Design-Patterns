package factory_method.factories;
import factory_method.interfaces.*;
import factory_method.cat.*;

public class CATFactory implements QuestionEvaluatorFactory {
    public QuestionEvaluator createEvaluator(String questionType, String difficulty) { 
        QuestionEvaluator evaluator;
        switch (questionType) {
            case "MCQ":
                evaluator = new CAT_mcq_eval();
                break;
            case "FILLIN":
                evaluator = new CAT_fillin_eval();
                break;
            case "ESSAY":
                evaluator = new CAT_essay_eval();
                break;
            case "TRUEFALSE":
                evaluator = new CAT_truefalse_eval();
                break;
            case "CODING":  
                evaluator = new CAT_coding_eval();
                break;
            default:
                throw new IllegalArgumentException("Invalid question type: " + questionType);
        }
        
        System.out.println("Setting difficulty: " + difficulty + " for CAT " + questionType);
        return evaluator;
    }
}