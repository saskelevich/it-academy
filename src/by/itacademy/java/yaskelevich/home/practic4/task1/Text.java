package by.itacademy.java.yaskelevich.home.practic4.task1;

public class Text extends Sentence {
    private Sentence[] text;
    private Word title;

    public Text() {
    }

    public Text(final Sentence[] text, final Word title) {
        this.text = text;
        this.title = title;
    }

    @Override
    public void show() {
        for (final Sentence sentence : text) {
            sentence.show();
        }
    }

    public void addText(final Sentence[] text) {
        final Sentence[] tmp = new Sentence[this.text.length + text.length];
        for (int i = 0; i < this.text.length; i++) {
            for (int j = 0; j < text.length; j++) {
                tmp[i] = this.text[i];
                tmp[this.text.length + j] = text[j];
            }
        }
        this.text = tmp;
    }

    public Word getTitle() {
        return this.title;
    }

    public void setTitle(final Word title) {
        this.title = title;
    }

    public Sentence[] getText() {
        return this.text;
    }

    public void setText(final Sentence[] text) {
        this.text = text;
    }

}
