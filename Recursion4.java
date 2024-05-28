public class Recursion4 {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(0));
        System.out.println(decimalToBinary(1));
        System.out.println(decimalToBinary(2));
        System.out.println(decimalToBinary(3));
        System.out.println(decimalToBinary(4));
        System.out.println(decimalToBinary(5));
        System.out.println(decimalToBinary(6));
    }

    public static int decimalToBinary(int number){
        return convert(number, "");
    }

    public static int convert(int number,String result){
        if(number == 0){
            if(result.length() != 0){
                return Integer.parseInt(result);
            }
            else{
                return 0;
            }
        }
        else{
            int binaryNumber = number%2;
            result = binaryNumber + result;
            number = number/2;
            return convert(number, result);
        }
    }
}