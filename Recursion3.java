public class Recursion3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abab"));
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String input){
        if(input.length()==1 || input.equals("")){
            return true;
        }
        else if(input.charAt(0) != input.charAt(input.length()-1)){
            return false;
        }
        else{
            return isPalindrome(input.substring(1,input.length()-1));
        }
    }
}