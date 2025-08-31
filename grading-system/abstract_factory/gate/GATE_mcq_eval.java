package abstract_factory.gate;
import abstract_factory.interfaces.MCQEvaluator;

public class GATE_mcq_eval implements MCQEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per GATE MCQ questions.");
    }
}