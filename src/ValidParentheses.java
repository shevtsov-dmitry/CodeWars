public class ValidParentheses {
    public static boolean validParentheses(String parens){
        char wantToFind = '(';
        char[] arrChar = parens.toCharArray();
        int index = arrChar.length;

        for(int i = arrChar.length; i > 0; i--){
            if(i == wantToFind){
                index--;
            }
        }
        System.out.println(index);
        return true;
    }}
