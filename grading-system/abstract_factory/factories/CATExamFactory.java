package abstract_factory.factories;
import abstract_factory.interfaces.*;
import abstract_factory.cat.*;

public class CATExamFactory implements ExamFactory{
    public MCQEvaluator createMCQEvaluator(String difficulty){
        System.out.println("Setting difficulty: " + difficulty + " for CAT MCQ");
        return new CAT_mcq_eval();
    }
    public FillInEvaluator createFillInEvaluator(String difficulty){ 
        System.out.println("Setting difficulty: " + difficulty + " for CAT FillIn");
        return new CAT_fillin_eval();
    }
    public EssayEvaluator createEssayEvaluator(String difficulty){ 
        System.out.println("Setting difficulty: " + difficulty + " for CAT Essay");
        return new CAT_essay_eval();
    }
    public TrueFalseEvaluator createTrueFalseEvaluator(String difficulty){ 
        System.out.println("Setting difficulty: " + difficulty + " for CAT TrueFalse");
        return new CAT_truefalse_eval();
    }
    public CodingEvaluator createCodingEvaluator(String difficulty){ 
        System.out.println("Setting difficulty: " + difficulty + " for CAT Coding");
        return new CAT_coding_eval();
    }
}