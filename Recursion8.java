public class Recursion8 {
    public static void main(String[] args) {
        int[] array = {5,1,4,3,7,9,0,2,1};
        print(array);
        mergeSort(array, 0, array.length-1);
        print(array);
    }

    public static void mergeSort(int[] array,int left,int right){
        if(left<right){
            int middle = (left+right)/2;
            mergeSort(array, left, middle);
            mergeSort(array, middle+1, right);
            merge(array,left,middle,right);
        }
    }

    public static void merge(int[] array,int left,int middle,int right){
        int[] leftArray = new int[(middle)-(left)+1];
        int[] rightArray = new int[right-(middle+1)+1];

        int i1 = left;
        int i2 = middle+1;

        int index1 = 0;
        while(i1<middle+1){
            leftArray[index1] = array[i1];
            i1++;
            index1++;
        }
        
        int index2 = 0;
        while(i2<right+1){
            rightArray[index2] = array[i2];
            i2++;
            index2++;
        }

        index1 = 0;
        index2 = 0;

        int k = 0;
        while(index1<leftArray.length && index2<rightArray.length){
            if(leftArray[index1] < rightArray[index2]){
                array[left + k] = leftArray[index1];
                index1++;
            }
            else if(leftArray[index1] == rightArray[index2]){
                array[left+k] = leftArray[index1];
                array[left+k+1] = rightArray[index2];
                index1++;
                index2++;
                k++;
            }
            else{
                array[left+k] = rightArray[index2];
                index2++;
            }
            k++;
        }

        if(index1<leftArray.length){
            while(index1<leftArray.length){
                array[left+k] = leftArray[index1];
                index1++;
                k++;
            }
        }

        if(index2<rightArray.length){
            while(index2<rightArray.length){
                array[left+k] = rightArray[index2];
                index2++;
                k++;
            }
        }
    }

    public static void print(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}