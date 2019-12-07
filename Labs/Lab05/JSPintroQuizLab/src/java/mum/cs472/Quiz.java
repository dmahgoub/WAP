/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.cs472;

/**
 *
 * @author 610522
 */
public class Quiz {

    private String[] questions;
    private String[] hints;
    private int[] answers;
    private int score;

    public Quiz(String[] questions, int[] answers, String[] hints) {
        this.questions = questions;
        this.hints = hints;
        this.answers = answers;
        score = 0;
    }

    public String getQuestion(int i) {
        return questions[i];
    }
    
        public String getHint(int i) {
        return hints[i];
    }

    public int[] getAnswers() {
        return answers;
    }

    public int getScore() {
        return score;
    }

    public boolean checkAnswer(int answer, int index) {
        if (index >= questions.length) {
            return false;
        }
        if (answer == answers[index]) {
            score = score + 10;
        }
        return answer == answers[index];
    }
}
