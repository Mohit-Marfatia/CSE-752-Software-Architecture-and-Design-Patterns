package abstract_factory.factories;
import abstract_factory.interfaces.*;
import abstract_factory.cat.*;

public class CATExamFactory implements ExamFactory {
    public MCQEvaluator createMCQEvaluator() { 
        return new CAT_mcq_eval();
    }
    public FillInEvaluator createFillInEvaluator() {
        return new CAT_fillin_eval(); 
    }
    public EssayEvaluator createEssayEvaluator() {
        return new CAT_essay_eval(); 
    }
    public TrueFalseEvaluator createTrueFalseEvaluator() {
        return new CAT_truefalse_eval(); 
    }
    public CodingEvaluator createCodingEvaluator() {
        return new CAT_coding_eval(); 
    }
}
