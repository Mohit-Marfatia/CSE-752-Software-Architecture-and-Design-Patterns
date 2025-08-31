package abstract_factory.jee;
import abstract_factory.interfaces.EssayEvaluator;

public class JEE_essay_eval implements EssayEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per JEE essay questions.");
    }
    
}
