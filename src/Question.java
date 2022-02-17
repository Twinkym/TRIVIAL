import java.util.Objects;

public class Question {

    private String title;
    private boolean correctAnswer;
    private boolean readerAnswer;
    private int score;
    private String topic;
    

    public Question(String pregunta, boolean respuestaCorrecta, int puntuacion) {
        this.title = pregunta;
        this.correctAnswer = respuestaCorrecta;
        this.readerAnswer = false;
        this.score = puntuacion;

    }

    public void setQuestion(String pregunta) {
        this.title = pregunta;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setReaderAnswer(boolean readerAnswer) {
        this.readerAnswer = readerAnswer;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getQuestion() {
        return title;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public boolean isReaderAnswer() {
        return readerAnswer;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question pregunta1 = (Question) o;
        return correctAnswer == pregunta1.correctAnswer && readerAnswer == pregunta1.readerAnswer && score == pregunta1.score && Objects.equals(title, pregunta1.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, correctAnswer, readerAnswer, score);
    }
}