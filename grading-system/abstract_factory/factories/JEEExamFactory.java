package abstract_factory.factories;
import abstract_factory.interfaces.*;
import abstract_factory.jee.*;

public class JEEExamFactory implements ExamFactory{
    public MCQEvaluator createMCQEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating MCQ evaluator for JEE exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: JEEExamFactory");
        System.out.println("[LOG] Successfully created: JEE_mcq_eval");
        return new JEE_mcq_eval();
    }
    
    public FillInEvaluator createFillInEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating FILLIN evaluator for JEE exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: JEEExamFactory");
        System.out.println("[LOG] Successfully created: JEE_fillin_eval");
        return new JEE_fillin_eval();
    }
    
    public EssayEvaluator createEssayEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating ESSAY evaluator for JEE exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: JEEExamFactory");
        System.out.println("[LOG] Successfully created: JEE_essay_eval");
        return new JEE_essay_eval();
    }
    
    public TrueFalseEvaluator createTrueFalseEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating TRUEFALSE evaluator for JEE exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: JEEExamFactory");
        System.out.println("[LOG] Successfully created: JEE_truefalse_eval");
        return new JEE_truefalse_eval();
    }
    
    public CodingEvaluator createCodingEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating CODING evaluator for JEE exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: JEEExamFactory");
        System.out.println("[LOG] Successfully created: JEE_coding_eval");
        return new JEE_coding_eval();
    }
}