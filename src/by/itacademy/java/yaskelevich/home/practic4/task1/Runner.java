package by.itacademy.java.yaskelevich.home.practic4.task1;

//1. Создать объект класса Текст, используя классы Предложение, Слово.
//Методы: дополнить текст, вывести на консоль текст, заголовок текста.
public class Runner {
    public static void main(final String[] args) {
        final Sentence sentence = new Sentence(
                new Word[] {new Word("word1"), new Word("word2"), new Word("word3")});

        final Text text = new Text(new Sentence[] {new Sentence(sentence), new Sentence(sentence)},
                new Word("Title"));

        text.show();
        text.addText(new Sentence[] {new Sentence(sentence), new Sentence(sentence)});
        System.out.println();
        text.show();
        System.out.printf("\n%s", text.getTitle().getWord());
    }
}
