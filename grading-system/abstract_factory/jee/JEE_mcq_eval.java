package abstract_factory.jee;
import abstract_factory.interfaces.MCQEvaluator;

public class JEE_mcq_eval implements MCQEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per JEE MCQ questions.");
    }
    
}
