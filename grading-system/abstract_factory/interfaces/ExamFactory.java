package abstract_factory.interfaces;

public interface ExamFactory {
    MCQEvaluator createMCQEvaluator();
    FillInEvaluator createFillInEvaluator();
    EssayEvaluator createEssayEvaluator();
    TrueFalseEvaluator createTrueFalseEvaluator();
    CodingEvaluator createCodingEvaluator();
}
