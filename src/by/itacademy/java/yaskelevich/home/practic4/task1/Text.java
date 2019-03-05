package by.itacademy.java.yaskelevich.home.practic4.task1;

import java.util.ArrayList;

public class Text {
    private Word title;
    private ArrayList<Sentence> text;

    public Text() {
        this.text = new ArrayList<Sentence>();
    }

    public Word getTitle() {
        return title;
    }

    public void setTitle(final Word title) {
        this.title = title;
    }

    public ArrayList<Sentence> getText() {
        return text;
    }

    public void setText(final ArrayList<Sentence> text) {
        this.text = text;
    }

    public void setText(final Sentence[] text) {
        add(text);
    }

    public void add(final Sentence[] text) {
        for (int i = 0; i < text.length; i++) {
            this.text.add(text[i]);
        }
    }

    public void print() {
        for (final Sentence sentence : text) {
            sentence.print();
            System.out.println();
        }
    }

    public void printTitle() {
        System.out.println(this.title.getWord());
    }

}
