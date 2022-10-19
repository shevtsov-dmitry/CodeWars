import java.util.Locale;

public class Isogram {

    public static boolean isIsogram(String str) {
        boolean done = true;
        str = str.toLowerCase(Locale.ROOT);
        char[] charStr = str.toCharArray();
        for(int i = 0; i < charStr.length;i++){
            for (int j = i + 1; j < charStr.length; j++) {
                if(charStr[i] == charStr[j]){
                    done = false;
                }
            }
        }
        return done;
    }

}
