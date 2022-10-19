import java.util.ArrayList;

public class HighestAndLowestFromString {
    public static String findThem(String str){
        String[] strArr = str.split(" ");
        ArrayList<Integer> nums = new ArrayList<>();
        for (String s : strArr)
            nums.add(Integer.parseInt(s));
        Integer xMin = nums.get(0);
        Integer xMax = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if(xMin > nums.get(i))
                xMin = nums.get(i);
            if(xMax < nums.get(i))
                xMax = nums.get(i);
        }
        return xMax.toString() + " " + xMin.toString();
    }}
