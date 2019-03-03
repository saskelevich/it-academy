package by.itacademy.java.yaskelevich.home.practic4.task1;

public class Sentence extends Word {
    private Word[] sentence;

    public Sentence() {
    }

    public Sentence(final String word, final Word[] sentence) {
        super(word);
        this.sentence = sentence;
    }

    public Sentence(final Word[] sentence) {
        this.sentence = sentence;
    }

    public Sentence(final Sentence sentence) {
        this.sentence = sentence.getSentence();
    }

    @Override
    public void show() {
        for (final Word word : this.sentence) {
            word.show();
        }
    }

    public void addSentence(final Word[] sentence) {
        final Word[] tmp = new Word[this.sentence.length + sentence.length];
        for (int i = 0; i < this.sentence.length; i++) {
            for (int j = 0; j < sentence.length; j++) {
                tmp[i] = this.sentence[i];
                tmp[this.sentence.length + j] = sentence[j];
            }
        }
        this.sentence = tmp;
    }

    public void setSentence(final Word[] sentence) {
        this.sentence = sentence;
    }

    public Word[] getSentence() {
        return sentence;
    }

}
