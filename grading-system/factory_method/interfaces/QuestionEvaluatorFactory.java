package interfaces;

public interface QuestionEvaluatorFactory {
    QuestionEvaluator createEvaluator(String questionType);
}
