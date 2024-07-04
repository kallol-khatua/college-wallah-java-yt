class TwoPointer{
    static void sortZeroAndOne(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            if(arr[i] == 0) {
                i++;
            } else if(arr[j] == 1) {
                j--;
            }else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class JAVA_18_Array_5 {
    public static void main(String[] args) {
//        sort array of 0 and 1 - send all 0's to the first and 1's to the end
        int[] arr_1 = {1, 0, 0, 1, 0, 1, 1, 1, 0};
        TwoPointer.printArray(arr_1);
        TwoPointer.sortZeroAndOne(arr_1);;
        TwoPointer.printArray(arr_1);
    }
}
