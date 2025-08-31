package factory_method.factories;
import factory_method.interfaces.*;
import factory_method.gate.*;

public class GATEFactory implements QuestionEvaluatorFactory {
    public QuestionEvaluator createEvaluator(String questionType) {
        switch (questionType) {
            case "MCQ":
                return new GATE_mcq_eval();
            case "FILLIN":
                return new GATE_fillin_eval();
            case "ESSAY":
                return new GATE_essay_eval();
            case "TRUEFALSE":
                return new GATE_truefalse_eval();
            case "CODING":
                return new GATE_coding_eval();
            default:
                throw new IllegalArgumentException("Invalid question type: " + questionType);
        }
    }
}
