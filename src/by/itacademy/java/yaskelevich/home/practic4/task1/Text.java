package by.itacademy.java.yaskelevich.home.practic4.task1;

public class Text extends Sentence {
    private String text;
    private String title;

    public Text() {
        // TODO Auto-generated constructor stub
    }

    public Text(final String word, final String sentence, final String text, final String title) {
        super(word, sentence);
        this.text = text;
        this.title = title;
    }

    @Override
    public void show() {
//        super.show();
        System.out.println(this.text);
    }

    @Override
    public void add(final String text) {
        StringBuilder tmp = new StringBuilder(this.text);
        tmp = tmp.append(text);
        this.text = tmp.toString();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getText() {
        return this.text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (super.toString() + "\n" + this.title + "\n" + this.text);
    }
}
