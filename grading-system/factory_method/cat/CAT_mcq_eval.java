package factory_method.cat;
import factory_method.interfaces.QuestionEvaluator;

public class CAT_mcq_eval implements QuestionEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per CAT MCQ questions."); 
    }
}