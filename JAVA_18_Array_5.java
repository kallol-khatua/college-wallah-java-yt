import javax.swing.plaf.basic.BasicDesktopIconUI;

class TwoPointer {
    static void sortZeroAndOne(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }

        }
    }

    static void sortEvenAndOdd(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {   // swap condition should be at first
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (arr[i] % 2 == 0) {
                i++;
            }
            if (arr[j] % 2 != 0) {
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

    static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;
        int[] ans = new int[n];
        int k = 0;
        while (i <= j) {
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k++] = arr[i] * arr[i];
                i++;
            } else {
                ans[k++] = arr[j] * arr[j];
                j--;
            }
        }
//        reverse the answer array
        i = 0;
        j = n - 1;
        while (i < j){
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
        return ans;
    }
}

public class JAVA_18_Array_5 {
    public static void main(String[] args) {
//        sort array of 0 and 1 - send all 0's to the first and 1's to the end
        int[] arr_1 = {1, 0, 0, 1, 0, 1, 1, 1, 0};
//        TwoPointer.printArray(arr_1);
//        TwoPointer.sortZeroAndOne(arr_1);
//        TwoPointer.printArray(arr_1);


//        an array of integers, move all the even integers to the beginning and all odd to  the end
//        relative order does not matter
        int[] arr_2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        TwoPointer.printArray(arr_2);
//        TwoPointer.sortEvenAndOdd(arr_2);
//        TwoPointer.printArray(arr_2);



//        we have one non-decreasing array , return an array which consist of the square of all elements in non-decreasing order
        int[] arr_3 = {-10, -3, -2, 1, 4, 5};
        int[] arr_4 = {2, 4, 5, 6, 7, 9};
        TwoPointer.printArray(TwoPointer.sortSquares(arr_3));
    }
}
