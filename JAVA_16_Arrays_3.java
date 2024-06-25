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

    static int findUnique(int[] arr) {
        int ans = -1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                ans = arr[i];
                return arr[i];
            }
        }
        return ans;
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findSecondMax(int[] arr) {
        int max = findMax(arr.clone());
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

//        int secondMax = Integer.MIN_VALUE;
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] > secondMax) {
//                secondMax = arr[i];
//            }
//        }
//        return secondMax;

//        int secondMax = findMax(arr.clone());
//        return secondMax;

        return findMax(arr.clone());
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

        int[] arr_3 = {1, 2, 3, 4, 2, 1, 3};
//        System.out.println(obj.findUnique(arr_3.clone()));

//        q-4 -- find second max
        int[] arr_4 = {-7, -8, -2, -4, 7};
        System.out.println(obj.findSecondMax(arr_4.clone()));

    }
}
