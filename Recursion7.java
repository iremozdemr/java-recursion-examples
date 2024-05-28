public class Recursion7 {
    public static void main(String[] args) {
        System.out.println(fibonacci1(0));
        System.out.println(fibonacci1(1));
        System.out.println(fibonacci1(2));
        System.out.println(fibonacci1(9));
    }

    public static int fibonacci1(int number){
        if(number == 0){
            return 0;
        }
        else if(number == 1){
            return 1;
        }
        return fibonacci1(number-1) + fibonacci1(number-2);
    }
}