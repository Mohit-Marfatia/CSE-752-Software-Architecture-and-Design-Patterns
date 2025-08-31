package factory_method.factories;
import factory_method.interfaces.*;
import factory_method.gate.*;

public class GATEFactory implements QuestionEvaluatorFactory {
    public QuestionEvaluator createEvaluator(String questionType, String difficulty) {
        
        System.out.println("[LOG] Creating " + questionType + " evaluator for GATE exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: GATEFactory");
        
        QuestionEvaluator evaluator;
        switch (questionType) {
            case "MCQ":
                evaluator = new GATE_mcq_eval();
                break;
            case "FILLIN":
                evaluator = new GATE_fillin_eval();
                break;
            case "ESSAY":
                evaluator = new GATE_essay_eval();
                break;
            case "TRUEFALSE":
                evaluator = new GATE_truefalse_eval();
                break;
            case "CODING":
                evaluator = new GATE_coding_eval();
                break;
            default:
                System.out.println("[LOG] ERROR: Invalid question type: " + questionType);
                throw new IllegalArgumentException("Invalid question type: " + questionType);
        }
        
        System.out.println("[LOG] Successfully created: " + evaluator.getClass().getSimpleName());
        return evaluator;
    }
}