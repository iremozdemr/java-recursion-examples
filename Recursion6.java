public class Recursion6 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        System.out.println(binarySearch(1, array1));
        System.out.println(binarySearch(2, array1));
        System.out.println(binarySearch(3, array1));
        System.out.println(binarySearch(99, array1));

        System.out.println();

        int[] array2 = {1,2,3,4};
        System.out.println(binarySearch(1, array2));
        System.out.println(binarySearch(2, array2));
        System.out.println(binarySearch(3, array2));
        System.out.println(binarySearch(4, array2));
        System.out.println(binarySearch(99, array2));
    }

    public static int binarySearch(int number,int[] array){
        int length = array.length;
        return search(number, array, 0, length-1);
    }

    public static int search(int number,int[] array,int left,int right){
        if(left == right){
            if(array[left] == number){
                return left;
            }
            else{
                System.out.print("not found ");
                return -1;
            }
        }
        else if(left+1 == right){
            if(array[left] == number){
                return left;
            }
            else if(array[right] == number){
                return right;
            }
            else{
                System.out.print("not found ");
                return -1;
            }
        }
        else{
            int middle = (left + right) / 2;
            if(array[middle] > number){
                right = middle;
                return search(number,array,left,right);
            }
            else if(array[middle] < number){
                left = middle;
                return search(number,array,left,right);
            }
            else{
                return middle;
            }
        }
    }
}