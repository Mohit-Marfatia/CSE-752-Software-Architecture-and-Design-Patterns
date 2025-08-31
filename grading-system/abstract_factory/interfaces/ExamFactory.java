package abstract_factory.interfaces;

public interface ExamFactory {
    MCQEvaluator createMCQEvaluator(String difficulty); 
    FillInEvaluator createFillInEvaluator(String difficulty); 
    EssayEvaluator createEssayEvaluator(String difficulty); 
    TrueFalseEvaluator createTrueFalseEvaluator(String difficulty);
    CodingEvaluator createCodingEvaluator(String difficulty); 
}