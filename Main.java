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
        System.out.println(x.isWordChain());        // test case

        ArrayList<String> moreWords = new ArrayList<String>();
        moreWords.add("to");
        moreWords.add("too");
        moreWords.add("stool");
        moreWords.add("tools");
        System.out.println(moreWords);
        WordChecker y = new WordChecker(moreWords);
        System.out.println(y.isWordChain());        // test case

        ArrayList<String> catchList = new ArrayList<String>();
        catchList.add("catch");
        catchList.add("bobcat");
        catchList.add("catchacat");
        catchList.add("cat");
        catchList.add("at");
        System.out.println(catchList);
        WordChecker u = new WordChecker(catchList);
        System.out.println(u.createList("cat"));        // test case
        System.out.println(u.createList("catch"));      // test case
        System.out.println(u.createList("dog"));        // test case
    }
}
