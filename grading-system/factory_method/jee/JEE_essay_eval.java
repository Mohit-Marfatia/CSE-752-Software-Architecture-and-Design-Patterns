package jee;
import interfaces.QuestionEvaluator;

public class JEE_essay_eval implements QuestionEvaluator {
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + " as per JEE essay questions.");
    }
    
}
