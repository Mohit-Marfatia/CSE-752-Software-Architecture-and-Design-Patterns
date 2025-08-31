package abstract_factory.factories;
import abstract_factory.interfaces.*;
import abstract_factory.gate.*;

public class GATEExamFactory implements ExamFactory{
    public MCQEvaluator createMCQEvaluator(String difficulty){
        System.out.println("Setting difficulty: " + difficulty + " for GATE MCQ");
        return new GATE_mcq_eval();
    }
    public FillInEvaluator createFillInEvaluator(String difficulty){
        System.out.println("Setting difficulty: " + difficulty + " for GATE FillIn");
        return new GATE_fillin_eval();
    }
    public EssayEvaluator createEssayEvaluator(String difficulty){
        System.out.println("Setting difficulty: " + difficulty + " for GATE Essay");
        return new GATE_essay_eval();
    }
    public TrueFalseEvaluator createTrueFalseEvaluator(String difficulty){
        System.out.println("Setting difficulty: " + difficulty + " for GATE TrueFalse");
        return new GATE_truefalse_eval();
    }
    public CodingEvaluator createCodingEvaluator(String difficulty){
        System.out.println("Setting difficulty: " + difficulty + " for GATE Coding");
        return new GATE_coding_eval();
    }
}