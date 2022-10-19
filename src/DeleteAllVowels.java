import java.util.ArrayList;
import java.util.Arrays;

public class DeleteAllVowels {
    public static String disemvowel(String str){
        String[] arrStr = str.split(" ");
        char[] arrVowels = {'a','e','i','o','u','A','E','I','O','U'};
        ArrayList<String> plusPlus = new ArrayList<>();
        for (String s : arrStr) {
            char[] arrChar = s.toCharArray();
            for (int j = 0; j < arrChar.length; j++) {
                if (arrChar[j] == ','){
                    arrChar[j] = '$';
                }
                for (char vowel : arrVowels) {
                    if (vowel == arrChar[j]) {
                        arrChar[j] = '0';
                        break;
                    }
                }
            }
            String gar = Arrays.toString(arrChar);
            String lol = gar.replace("[","")
                            .replace("]","")
                            .replace(",","")
                            .replace(" ","")
                            .replace("0","");
            plusPlus.add(lol);
        }
        String finish = plusPlus.toString();
        return finish.replace("[","")
                                    .replace("]","")
                                    .replace(",","")
                                    .replace("$",",");
    }
}
