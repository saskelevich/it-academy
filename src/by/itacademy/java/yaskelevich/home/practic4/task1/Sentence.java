package by.itacademy.java.yaskelevich.home.practic4.task1;

public class Sentence extends Word {
    private String sentence;

    public Sentence() {
        // TODO Auto-generated constructor stub
    }

    public Sentence(final String word, final String sentence) {
        super(word);
        this.sentence = sentence;
    }

    @Override
    public void show() {
//        super.show();
        System.out.println(this.sentence);
    }

    public void add(final String sentence) {
//        StringBuilder tmp = new StringBuilder(this.sentence);
//        tmp = tmp.append(sentence);
//        this.sentence = tmp.toString();
        this.sentence = new StringBuilder(this.sentence).append(sentence).toString();
    }

    public void setSentence(final String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (super.toString() + "\n" + this.sentence);
    }
}
