
import java.util.ArrayList;

public class Result {

    public static void main(String[] args) {
        String result = LongestEvenWords("It is a pleasant day today");
        System.out.println(result);
    }

    public static String LongestEvenWords(String sentence) {
        String words = "";
        String[] word = sentence.split(" ");
        ArrayList<String> evenWords = new ArrayList<>();
        for(String ev:word) {
            if(ev.length() % 2 == 0){
                evenWords.add(ev);
            }
        }
        if(evenWords.isEmpty()){
            words="00";
        } else {
            for (String wd : evenWords) {
                if (words.length() < wd.length()) {
                    words = wd;
                }
            }
        }
        if(sentence == "") {
            words = "00";
        }
        return words;

    }
}
