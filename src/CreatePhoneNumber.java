import java.util.Arrays;

public class CreatePhoneNumber {
    public static void createPhoneNumber(int[] numbers) {
        // => returns "(123) 456-7890"
        String change = Arrays.toString(numbers);
        change.replace("[","");
        System.out.println(change);
//        String[] arr = new String[14];
//        arr[0] = "(";

    }
}
