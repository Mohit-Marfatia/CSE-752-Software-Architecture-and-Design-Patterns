package abstract_factory.gate;
import abstract_factory.interfaces.EssayEvaluator;

public class GATE_essay_eval implements EssayEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per GATE essay questions.");
    }
    
}
