public class Recursion1{
    public static void main(String[] args) {
        sayHi(5);
        countBackwards(5);
        System.out.println(factorial(5));
        System.out.println(reverseString("hello"));
        System.out.println(isPalindrome("kayak"));
        System.out.println(sum(10));
        System.out.println(fibonacci(9));
        System.out.println(triangular(4));
    }

    public static void sayHi(int n){
        if(n==0){
            System.out.println("done!");
        }
        else{
            System.out.println("hi");
            n--;
            sayHi(n);
        }
    }

    public static void countBackwards(int n){
        if(n==-1){
            System.out.println("done!");
        }
        else{
            System.out.println(n);
            n--;
            countBackwards(n);
        }
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static String reverseString(String input){
        if(input.equals("")){
            return "";
        }
        return reverseString(input.substring(1)) + input.charAt(0);
    }

    public static boolean isPalindrome(String input){
        if(input.length()==0 || input.length()==1){
            return true;
        }

        if(input.charAt(0)==input.charAt(input.length()-1)){
            return isPalindrome(input.substring(1, input.length()-1));
        }

        return false;
    }

    public static int sum(int number){
        if(number==0){
            return 0;
        }
        return number + sum(number-1);
    }

    public static int fibonacci(int number){
        if(number==0){
            return 0;
        }
        if(number==1){
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number-2);
    }

    public static int triangular(int number){
        if(number==0){
            return number;
        }
        return triangular(number-1) + number;
    }
}