package abstract_factory.factories;
import abstract_factory.interfaces.*;
import abstract_factory.jee.*;

public class JEEExamFactory implements ExamFactory{
    public MCQEvaluator createMCQEvaluator(String difficulty){
        System.out.println("Setting difficulty: " + difficulty + " for JEE MCQ");
        return new JEE_mcq_eval();
    }
    public FillInEvaluator createFillInEvaluator(String difficulty){
        System.out.println("Setting difficulty: " + difficulty + " for JEE FillIn");
        return new JEE_fillin_eval();
    }
    public EssayEvaluator createEssayEvaluator(String difficulty){
        System.out.println("Setting difficulty: " + difficulty + " for JEE Essay");
        return new JEE_essay_eval();
    }
    public TrueFalseEvaluator createTrueFalseEvaluator(String difficulty){
        System.out.println("Setting difficulty: " + difficulty + " for JEE TrueFalse");
        return new JEE_truefalse_eval();
    }
    public CodingEvaluator createCodingEvaluator(String difficulty){
        System.out.println("Setting difficulty: " + difficulty + " for JEE Coding");
        return new JEE_coding_eval();
    }
}