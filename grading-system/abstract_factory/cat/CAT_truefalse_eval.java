package abstract_factory.cat;
import abstract_factory.interfaces.TrueFalseEvaluator;

public class CAT_truefalse_eval implements TrueFalseEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per CAT true false questions.");
    }
    
}
