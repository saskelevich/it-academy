package by.itacademy.java.yaskelevich.home.practic4.task1;

public class Sentence {
    private Word[] sentence;

    public Sentence() {
    }

    public Sentence(final Word[] sentence) {
        this.sentence = sentence;
    }

    public Word[] getSentence() {
        return sentence;
    }

    public void setSentence(final Word[] sentence) {
        this.sentence = sentence;
    }

    public void print() {
        for (final Word word : sentence) {
            System.out.printf("%s ", word.getWord());
        }
    }
}
