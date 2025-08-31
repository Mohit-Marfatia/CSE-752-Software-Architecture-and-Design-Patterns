package abstract_factory.gate;
import abstract_factory.interfaces.FillInEvaluator;

public class GATE_fillin_eval implements FillInEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per GATE fill in the blanks questions.");
    }
    
}
