package by.itacademy.java.yaskelevich.home.practic4.task1;

public class Word {
    protected String word;

    public Word() {
        // TODO Auto-generated constructor stub
    }

    public Word(final String word) {
        this.word = word;
    }

    public void show() {
        System.out.println(this.word);
    }

    public String getWord() {
        return word;
    }

    public void setWord(final String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return this.word;
    }
}
