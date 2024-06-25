class ArrayTargetSum {
    static int pairSum(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;
    }


    static int tripletSum(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

public class JAVA_16_Arrays_3 {
    public static void main(String[] args) {
        ArrayTargetSum obj = new ArrayTargetSum();
//        q - 1 -- target sum
        int[] arr_1 = {4, 6, 3, 5, 8, 2};
//        System.out.println(obj.pairSum(arr_1.clone(), 7));

//        q- 2 -- target sum
        int[] arr_2 = {1, 4, 5, 6, 3};
//        System.out.println(obj.tripletSum(arr_2.clone(), 12));


    }
}
