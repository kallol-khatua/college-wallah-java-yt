import java.util.Scanner;

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

    static void reverseInArray(int[] arr, int i, int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotateArrayInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
//        reverse 0 to n-k-1
        reverseInArray(arr, 0 , n - k -1);
//        reverse n-k to n-1
        reverseInArray(arr, n - k, n - 1);
//        reverse 0 to n-1
        reverseInArray(arr, 0, n - 1);
    }

    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        return  freq;
    }

    static void queryFind(int[] arr) {
        int[] freqArray = makeFrequencyArray(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of query you want to run");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Enter number");
            int num = sc.nextInt();
            if(freqArray[num] > 0) {
                System.out.println("Present");
            }else {
                System.out.println("Not present");
            }
        }
    }
}

public class JAVA_17_Array_4 {
    public static void main(String[] args) {
//        reverse an array
        int[] arr_1 = {2, 5, 6, 2, 7};
//        ArrayFour.printArray(arr_1);
//        ArrayFour.reverseArray(arr_1);
//        ArrayFour.printArray(arr_1);


//        rotate an array in place
        int[] arr_2 = {2, 4, 5, 6, 7};
//        ArrayFour.printArray(arr_2);
//        ArrayFour.rotateArrayInPlace(arr_2, 2);
//        ArrayFour.printArray(arr_2);

//        query finding - frequency array
        int[] arr_3 = {2, 4, 56, 76, 3};
        ArrayFour.queryFind(arr_3);
    }
}
