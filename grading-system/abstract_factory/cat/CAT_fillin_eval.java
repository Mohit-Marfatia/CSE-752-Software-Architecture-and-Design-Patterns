package abstract_factory.cat;
import abstract_factory.interfaces.FillInEvaluator;

public class CAT_fillin_eval implements FillInEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per CAT fill in the blanks questions.");
    }
    
}
