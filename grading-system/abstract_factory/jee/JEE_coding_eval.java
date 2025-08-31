package abstract_factory.jee;
import abstract_factory.interfaces.CodingEvaluator;

public class JEE_coding_eval implements CodingEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per JEE coding questions.");
    }
    
}
