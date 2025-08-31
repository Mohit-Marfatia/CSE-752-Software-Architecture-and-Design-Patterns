package abstract_factory.cat;
import abstract_factory.interfaces.CodingEvaluator;

public class CAT_coding_eval implements CodingEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per CAT coding questions.");
    }
    
}
