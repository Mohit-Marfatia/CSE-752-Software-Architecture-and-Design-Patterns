package factory_method.jee;
import factory_method.interfaces.QuestionEvaluator;

public class JEE_coding_eval implements QuestionEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per JEE coding questions.");
    }
}
