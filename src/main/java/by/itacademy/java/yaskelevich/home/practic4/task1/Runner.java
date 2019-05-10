package by.itacademy.java.yaskelevich.home.practic4.task1;

//1. Создать объект класса Текст, используя классы Предложение, Слово.
//Методы: дополнить текст, вывести на консоль текст, заголовок текста.
public class Runner {
    public static void main(final String[] args) {
        final Word[] word = new Word[] {new Word("word0"), new Word("word1"), new Word("word2")};

        final Sentence[] sentence = new Sentence[] {new Sentence(word), new Sentence(word),
                new Sentence(word)};

        final Text text = new Text();
        text.setTitle(new Word("Title"));
        text.setText(sentence);
        text.print();
        text.add(sentence);
        System.out.println();
        text.print();
        text.printTitle();
    }
}
