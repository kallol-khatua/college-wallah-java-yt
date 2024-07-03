class ArrayFour {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

public class JAVA_17_Array_4 {
    public static void main(String[] args) {
//        reverse an array
        int[] arr_1 = {2, 5, 6, 2, 7};
        ArrayFour.printArray(arr_1);
        ArrayFour.reverseArray(arr_1);
        ArrayFour.printArray(arr_1);
    }
}
