package abstract_factory.factories;
import abstract_factory.interfaces.*;
import abstract_factory.cat.*;

public class CATExamFactory implements ExamFactory{
    public MCQEvaluator createMCQEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating MCQ evaluator for CAT exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: CATExamFactory");
        System.out.println("[LOG] Successfully created: CAT_mcq_eval");
        return new CAT_mcq_eval();
    }
    
    public FillInEvaluator createFillInEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating FILLIN evaluator for CAT exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: CATExamFactory");
        System.out.println("[LOG] Successfully created: CAT_fillin_eval");
        return new CAT_fillin_eval();
    }
    
    public EssayEvaluator createEssayEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating ESSAY evaluator for CAT exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: CATExamFactory");
        System.out.println("[LOG] Successfully created: CAT_essay_eval");
        return new CAT_essay_eval();
    }
    
    public TrueFalseEvaluator createTrueFalseEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating TRUEFALSE evaluator for CAT exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: CATExamFactory");
        System.out.println("[LOG] Successfully created: CAT_truefalse_eval");
        return new CAT_truefalse_eval();
    }
    
    public CodingEvaluator createCodingEvaluator(String difficulty){
        
        System.out.println("[LOG] Creating CODING evaluator for CAT exam with difficulty: " + difficulty);
        System.out.println("[LOG] Timestamp: " + new java.util.Date());
        System.out.println("[LOG] Factory: CATExamFactory");
        System.out.println("[LOG] Successfully created: CAT_coding_eval");
        return new CAT_coding_eval();
    }
}