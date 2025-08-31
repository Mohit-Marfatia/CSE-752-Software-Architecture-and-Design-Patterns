package factory_method.gate;
import factory_method.interfaces.QuestionEvaluator;

public class GATE_fillin_eval implements QuestionEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per GATE fill in the blanks questions.");
    }
}
