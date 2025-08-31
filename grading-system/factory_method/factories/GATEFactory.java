package factory_method.factories;
import factory_method.interfaces.*;
import factory_method.gate.*;

public class GATEFactory implements QuestionEvaluatorFactory {
    public QuestionEvaluator createEvaluator(String questionType, String difficulty) { 
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
                throw new IllegalArgumentException("Invalid question type: " + questionType);
        }
        
        System.out.println("Setting difficulty: " + difficulty + " for GATE " + questionType);
        return evaluator;
    }
}