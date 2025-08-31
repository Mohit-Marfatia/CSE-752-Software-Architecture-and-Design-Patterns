package factories;
import interfaces.*;
import jee.*;

public class JEEFactory implements QuestionEvaluatorFactory {
    public QuestionEvaluator createEvaluator(String questionType) {
        switch (questionType) {
            case "MCQ":
                return new JEE_mcq_eval();
            case "FILLIN":
                return new JEE_fillin_eval();
            case "ESSAY":
                return new JEE_essay_eval();
            case "TRUEFALSE":
                return new JEE_truefalse_eval();
            default:
                throw new IllegalArgumentException("Invalid question type: " + questionType);
        }
    }
    
}
