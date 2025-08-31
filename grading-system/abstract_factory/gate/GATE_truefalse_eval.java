package abstract_factory.gate;
import abstract_factory.interfaces.TrueFalseEvaluator;

public class GATE_truefalse_eval implements TrueFalseEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per GATE true false questions.");
    }
    
}
