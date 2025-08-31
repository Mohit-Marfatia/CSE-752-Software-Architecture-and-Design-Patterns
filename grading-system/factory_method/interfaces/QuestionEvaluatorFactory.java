package factory_method.interfaces;

public interface QuestionEvaluatorFactory {
    QuestionEvaluator createEvaluator(String questionType);
}
