package factory_method.cat;
import factory_method.interfaces.QuestionEvaluator;

public class CAT_fillin_eval implements QuestionEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per CAT fill in the blanks questions.");
    }
}
