public class Recursion1{
    public static void main(String[] args) {
        sayHi(5);
        countBackwards(5);
        System.out.println(factorial(5));
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

    public static int triangular(int number){
        if(number==0){
            return number;
        }
        return triangular(number-1) + number;
    }
}