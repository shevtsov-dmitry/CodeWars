import java.sql.Struct;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpinWords {
    public static String spinWords(String sentence) {
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String reversedWord = "";
            if (arr[i].length() >= 5) {
                char[] arrChar = arr[i].toCharArray();
                for (int j = arrChar.length - 1; j >= 0; j--) {
                    reversedWord += arrChar[j];
                    arr[i] = reversedWord;
                }
            }
        }
        String see = Arrays.toString(arr);
        String newString = see.replace("[","").replace("]","").replace(",","");

        return newString;
    }

}

//ICONA
/*
import java.util.Arrays;

public class SpinWords {

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i=0; i<words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }
}
*/