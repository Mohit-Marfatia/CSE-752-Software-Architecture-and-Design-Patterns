package abstract_factory.factories;
import abstract_factory.interfaces.*;
import abstract_factory.gate.*;

public class GATEExamFactory implements ExamFactory{
    public MCQEvaluator createMCQEvaluator(){
        return new GATE_mcq_eval();
    }
    public FillInEvaluator createFillInEvaluator(){
        return new GATE_fillin_eval();
    }
    public EssayEvaluator createEssayEvaluator(){
        return new GATE_essay_eval();
    }
    public TrueFalseEvaluator createTrueFalseEvaluator(){
        return new GATE_truefalse_eval();
    }
    public CodingEvaluator createCodingEvaluator(){
        return new GATE_coding_eval();
    }
}
