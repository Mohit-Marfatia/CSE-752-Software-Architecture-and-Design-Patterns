package abstract_factory.factories;
import abstract_factory.interfaces.*;
import abstract_factory.jee.*;

public class JEEExamFactory implements ExamFactory{
    public MCQEvaluator createMCQEvaluator(){
        return new JEE_mcq_eval();
    }
    public FillInEvaluator createFillInEvaluator(){
        return new JEE_fillin_eval();
    }
    public EssayEvaluator createEssayEvaluator(){
        return new JEE_essay_eval();
    }
    public TrueFalseEvaluator createTrueFalseEvaluator(){
        return new JEE_truefalse_eval();
    }
    public CodingEvaluator createCodingEvaluator(){
        return new JEE_coding_eval();
    }
}
