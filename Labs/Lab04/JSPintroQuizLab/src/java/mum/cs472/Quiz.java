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
    private int[] answers;
    private int score;

    public Quiz(String[] questions, int[] answers) {
        this.questions = questions;
        this.answers = answers;
        score = 0;
    }

    public String getQuestion(int i) {
        return questions[i];
    }

    public int[] getAnswers() {
        return answers;
    }

    public int getAnswers(int i) {
        return answers[i];
    }

    public int getScore() {
        return score;
    }

    public boolean checkAnswer(int answer, int index) {
        if (index >= questions.length) {
            return false;
        }
        if (answer == answers[index]) {
            ++score;
        }
        return answer == answers[index];
    }
}
