public class Recursion5 {
    public static void main(String[] args) {
        System.out.println(sum(0));
        System.out.println(sum(1));
        System.out.println(sum(2));
        System.out.println(sum(3));
        System.out.println(sum(4));
        System.out.println(sum(-1));
    }

    public static int sum(int number){
        if(number == 0){
            return 0;
        }
        else if(number < 0){
            return number;
        }
        else{
            return number + sum(number-1);
        }
    }
}