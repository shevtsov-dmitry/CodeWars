
import java.util.ArrayList;
import java.util.Collections;

public class ToBinary {
    public static String binaryAddition(int a, int b){
        //your code here
        int c = a + b;
        int n;
        ArrayList<Integer> arr = new ArrayList<>();
        while(c > 0){
            if(c % 2 == 0){
                n = 0;
                arr.add(n);
            }
            else{
                n = 1;
                arr.add(n);
            }
            c/=2;
        }
        Collections.reverse(arr);
        String binary = arr.toString();
        return binary.replace("[", "").replace("]", "").replace(",", "").replace(" ","");
    }
}
