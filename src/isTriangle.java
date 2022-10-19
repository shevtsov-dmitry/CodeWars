public class isTriangle {
        public static boolean isTriangle(int a, int b, int c){
            boolean isIt = true;
            if((a+b)/3 > c || (a+c)/3 > b || (b+c)/3 > a)
                isIt = false;
            return isIt;
    }
}
