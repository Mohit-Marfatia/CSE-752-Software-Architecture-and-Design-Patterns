package abstract_factory.cat;
import abstract_factory.interfaces.MCQEvaluator;

public class CAT_mcq_eval implements MCQEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per CAT MCQ questions.");
    }
}