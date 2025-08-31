package abstract_factory.cat;
import abstract_factory.interfaces.EssayEvaluator;

public class CAT_essay_eval implements EssayEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per CAT essay questions.");
    }
    
}
