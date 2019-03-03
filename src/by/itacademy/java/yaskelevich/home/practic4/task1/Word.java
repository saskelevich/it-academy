package by.itacademy.java.yaskelevich.home.practic4.task1;

public class Word {
    private StringBuilder word;

    public Word() {
    }

    public Word(final String word) {
        this.setWord(word);
    }

    public String getWord() {
        return new String(this.word);
    }

    public void setWord(final String word) {
        this.word = new StringBuilder(word);
    }

    public void show() {
        System.out.printf("%s ", this.getWord());
    }

    public void addWord(final String word) {
        this.word = this.word.append(word);
    }

    public void addWord(final String... word) {
        this.word = this.word.append(word[0]);
    }

}
