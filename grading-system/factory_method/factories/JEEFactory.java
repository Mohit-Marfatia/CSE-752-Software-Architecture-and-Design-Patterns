package factory_method.factories;
import factory_method.interfaces.*;
import factory_method.jee.*;

public class JEEFactory implements QuestionEvaluatorFactory {
    public QuestionEvaluator createEvaluator(String questionType, String difficulty) {
        
        System.out.println("[LOG] Creating " + questionType + " evaluator for JEE exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: JEEFactory");
        
        QuestionEvaluator evaluator;
        switch (questionType) {
            case "MCQ":
                evaluator = new JEE_mcq_eval();
                break;
            case "FILLIN":
                evaluator = new JEE_fillin_eval();
                break;
            case "ESSAY":
                evaluator = new JEE_essay_eval();
                break;
            case "TRUEFALSE":
                evaluator = new JEE_truefalse_eval();
                break;
            case "CODING":
                evaluator = new JEE_coding_eval();
                break;
            default:
                System.out.println("[LOG] ERROR: Invalid question type: " + questionType);
                throw new IllegalArgumentException("Invalid question type: " + questionType);
        }
        
        System.out.println("[LOG] Successfully created: " + evaluator.getClass().getSimpleName());
        return evaluator;
    }
}