package abstract_factory.gate;
import abstract_factory.interfaces.CodingEvaluator;

public class GATE_coding_eval implements CodingEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per GATE coding questions.");
    }
    
}
