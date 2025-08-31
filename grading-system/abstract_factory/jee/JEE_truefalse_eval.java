package abstract_factory.jee;
import abstract_factory.interfaces.TrueFalseEvaluator;

public class JEE_truefalse_eval implements TrueFalseEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per JEE true false questions.");
    }
    
}
