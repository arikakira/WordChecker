import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());

        ArrayList<String> moreWords = new ArrayList<String>();
        moreWords.add("to");
        moreWords.add("too");
        moreWords.add("stool");
        moreWords.add("tools");
        System.out.println(moreWords);
        WordChecker y = new WordChecker(moreWords);
        System.out.println(y.isWordChain());

        
    }
}
