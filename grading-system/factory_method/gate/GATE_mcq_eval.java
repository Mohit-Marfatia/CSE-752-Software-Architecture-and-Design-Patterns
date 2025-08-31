package gate;
import interfaces.QuestionEvaluator;

public class GATE_mcq_eval implements QuestionEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per GATE MCQ questions."); 
    }
}