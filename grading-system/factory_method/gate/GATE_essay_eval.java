package gate;
import interfaces.QuestionEvaluator;

public class GATE_essay_eval implements QuestionEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per GATE essay questions.");
    }
    
}
