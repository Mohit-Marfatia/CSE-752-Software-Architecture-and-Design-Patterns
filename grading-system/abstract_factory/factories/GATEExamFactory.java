package abstract_factory.factories;
import abstract_factory.interfaces.*;
import abstract_factory.gate.*;

public class GATEExamFactory implements ExamFactory{
    public MCQEvaluator createMCQEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating MCQ evaluator for GATE exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: GATEExamFactory");
        System.out.println("[LOG] Successfully created: GATE_mcq_eval");
        return new GATE_mcq_eval();
    }
    
    public FillInEvaluator createFillInEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating FILLIN evaluator for GATE exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: GATEExamFactory");
        System.out.println("[LOG] Successfully created: GATE_fillin_eval");
        return new GATE_fillin_eval();
    }
    
    public EssayEvaluator createEssayEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating ESSAY evaluator for GATE exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: GATEExamFactory");
        System.out.println("[LOG] Successfully created: GATE_essay_eval");
        return new GATE_essay_eval();
    }
    
    public TrueFalseEvaluator createTrueFalseEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating TRUEFALSE evaluator for GATE exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: GATEExamFactory");
        System.out.println("[LOG] Successfully created: GATE_truefalse_eval");
        return new GATE_truefalse_eval();
    }
    
    public CodingEvaluator createCodingEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating CODING evaluator for GATE exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: GATEExamFactory");
        System.out.println("[LOG] Successfully created: GATE_coding_eval");
        return new GATE_coding_eval();
    }
}