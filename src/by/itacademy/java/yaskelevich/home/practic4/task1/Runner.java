package by.itacademy.java.yaskelevich.home.practic4.task1;

public class Runner {
    public static void main(final String[] args) {
/////////////////////////////////////////////////////////////
//        class word

//        final Word word = new Word("word");
//        word.show();
//        word.addWord("drow");
//        word.show();
/////////////////////////////////////////////////////////////
//        class sentence

        final Sentence sentence = new Sentence(
                new Word[] {new Word("word1"), new Word("word2"), new Word("word3")});
//        sentence.show();
////        System.out.println(sentence.toString());
//
////        sentence.sentence[0].addWord("#");
////        sentence.show();
//
//        sentence.addSentence(new Word[] {new Word("word4")});
//        System.out.println();
//        sentence.show();
/////////////////////////////////////////////////////////////
//        class Text

        final Text text = new Text(new Sentence[] {new Sentence(sentence)}, new Word("Title"));

        text.show();
        text.addText(new Sentence[] {new Sentence(sentence)});
        System.out.println();
        System.out.println(text.toString());
    }
}
