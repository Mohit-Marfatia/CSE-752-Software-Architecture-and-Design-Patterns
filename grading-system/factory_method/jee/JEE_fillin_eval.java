package jee;
import interfaces.QuestionEvaluator;

public class JEE_fillin_eval implements QuestionEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per JEE fill in the blanks questions.");
    }
    
}
