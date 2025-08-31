package abstract_factory.jee;
import abstract_factory.interfaces.FillInEvaluator;

public class JEE_fillin_eval implements FillInEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per JEE fill in the blanks questions.");
    }
    
}
