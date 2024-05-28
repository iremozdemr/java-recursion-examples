public class Recursion2 {
    public static void main(String[] args) {
        System.out.println(reverseString("a"));
        System.out.println(reverseString("ab"));
        System.out.println(reverseString("abc"));
        System.out.println(reverseString(""));
        System.out.println(reverseString(" "));
        System.out.println(reverseString("hello world"));
    }

    public static String reverseString(String input){
        if(input.equals("")){
            return "";
        }
        else{
            return reverseString(input.substring(1)) + input.charAt(0);
        }
    }
}