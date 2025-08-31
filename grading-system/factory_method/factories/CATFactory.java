package factory_method.factories;
import factory_method.interfaces.*;
import factory_method.cat.*;

public class CATFactory implements QuestionEvaluatorFactory {
    public QuestionEvaluator createEvaluator(String questionType) {
        switch (questionType) {
            case "MCQ": 
                return new CAT_mcq_eval();
            case "FILLIN": 
                return new CAT_fillin_eval();
            case "ESSAY":
                return new CAT_essay_eval();
            case "TRUEFALSE":
                return new CAT_truefalse_eval();
            default:
                throw new IllegalArgumentException("Invalid question type");
        }
    }
}
