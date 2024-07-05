class PrefixSum{
    static int [] prefixSumArray(int[] arr) {
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

    }
}
