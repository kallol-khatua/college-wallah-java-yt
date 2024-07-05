import java.util.Scanner;

class PrefixSum {
    static int[] prefixSumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class JAVA_19_Array_6 {
    public static void main(String[] args) {

        int[] arr_1 = {1, 2, 3, 4, 5};
//        int[] arr = PrefixSum.prefixSumArray(arr_1);
//        PrefixSum.printArray(arr);

//        given array of integers, answer q queries where you have tell the sum of a given range from l to r(both include)
//        where l and r follows 1 based indexing
//        first make prefix sum array
        int[] arr_2 = {2, 4, 5, 6, 2, 8, 3};
        int[] prefixSumArray = PrefixSum.prefixSumArray(arr_2);
        System.out.println("enter number of queries");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println("Enter starting index");
            int s = sc.nextInt();
            System.out.println("Enter last index");
            int l = sc.nextInt();
            if (s == 1) {
                System.out.println("Sum is " + prefixSumArray[l - 1]);
            } else {
                System.out.println("Sum is " + (prefixSumArray[l - 1] - prefixSumArray[s - 2]));
            }
        }

    }
}
