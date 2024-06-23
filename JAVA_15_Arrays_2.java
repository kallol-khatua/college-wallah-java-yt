import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class SecondLecture {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void takingInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        for(int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
        printArray(arr);
    }

    static void shallowCopy() {
        int[] arr_1 = {3, 8, 2, 7};
        int[] arr_2 = arr_1; // this is shallow copy - reference are copied not the actual array
        System.out.println("Original array");
        printArray(arr_1);
        System.out.println("Copied array");
        printArray(arr_2);

//        changing value of the copied array
        arr_2[1] = 5; // change affect the original array
        System.out.println("Original array after change the copied array");
        printArray(arr_1);
        System.out.println("Copied array after change the value of copied array");
        printArray(arr_2);
    }

    static void deepCopy() {
        int[] arr_1 = {3, 8, 2, 7};
        int[] arr_2 = arr_1.clone(); // this is deep copy - new array is created
        System.out.println("Original array");
        printArray(arr_1);
        System.out.println("Copied array");
        printArray(arr_2);

//        changing value of the copied array
        arr_2[1] = 5; // change do not affect the original array
        System.out.println("Original array after changing the value of copied array");
        printArray(arr_1);
        System.out.println("Copied array after changing the value of copied array");
        printArray(arr_2);

        System.out.println("Deep copy using Arrays.copyOf() method");

        int[] arr_3 = Arrays.copyOf(arr_1, arr_1.length);
        printArray(arr_3);
        arr_3[2] = 9;
        System.out.println("Original array after changing the value of copied array");
        printArray(arr_1);
        System.out.println("Copied array after changing the value of copied array");
        printArray(arr_3);
    }

    static void deepCopyMethod() {
        int[] arr = {3, 8, 2, 7, 6};
        System.out.println("Original array");
        printArray(arr);
//        copyOf(array_name, size) method copy the first n(size) element
        int[] arr_2 = Arrays.copyOf(arr, arr.length);
        printArray(arr_2);

        int[] arr_3 = Arrays.copyOf(arr, 3);
        printArray(arr_3);
//                                              [      )
        int[] arr_4 = Arrays.copyOfRange(arr, 0, arr.length);
        printArray(arr_4);

//                                                  [   )
        int[] arr_5 = Arrays.copyOfRange(arr, 1, 4);
        printArray(arr_5);

        int[] arr_6 = Arrays.copyOfRange(arr, 1, 40);  // extra element will be 0
    }

    static int countOccurrence(int[] arr, int x) {
       int count = 0;
       for(int e: arr) {
           if(e == x) {
               count++;
           }
       }
       return count;
    }

    static int lastOccurrence(int[] arr, int x){
        int idx = -1;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == x) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    static int strictlyGreater(int[] arr, int x) {
        int count = 0;
        for(int e:arr) {
            if(e > x) {
                count++;
            }
        }
        return count;
    }

    static boolean isSorted(int[] arr) {
        boolean check = true;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                check = false;
                return check;
            }
        }
        return check;
    }

    static int findSmallest(int[] arr) {
        int min = arr[0];
        for(int e: arr) {
            if(e < min) {
                min = e;
            }
        }
        return min;
    }

    static int findLargest(int[] arr) {
        int max = arr[0];
        for(int e: arr) {
            if(e > max) {
                max = e;
            }
        }
        return max;
    }

    static int[] smallestAndLargetElement(int[] arr) {
        int[] ans = new int[2];
        int min = findSmallest(arr);
        System.out.println(min);
        int max = findLargest(arr);
        System.out.println(max);

//        using sort method
        Arrays.sort(arr);
        System.out.println("Smallest = " + arr[0]);
        System.out.println("Largest = " + arr[arr.length - 1]);


        ans[0] = min;
        ans[1] = max;
        return ans;
    }
}

public class JAVA_15_Arrays_2 {
    public static void main(String[] args) {
        SecondLecture obj = new SecondLecture();
//        obj.takingInput();
//        obj.shallowCopy();
//        obj.deepCopy();
//        obj.deepCopyMethod();

        int[] arr = {5, 6, 5, 1, 5};
//        System.out.println(obj.countOccurrence(arr.clone(), 4));

        int[] arr_2 = {4, 8, 5, 4, 8};
//        System.out.println(obj.lastOccurrence(arr_2.clone(), 8));

        int[] arr_3 = {5, 8, 6, 9, 2};
//        System.out.println(obj.strictlyGreater(arr_3.clone(), 4));

//        int[] arr_4 = {1, 5, 7, 8, 9};
        int[] arr_4 = {1, 5, 7, 3, 9};
//        System.out.println(obj.isSorted(arr_4));

        int[] arr_5 = {4, 5, 2, 7, 6};
        int[] ans = obj.smallestAndLargetElement(arr_5);
        obj.printArray(ans);
    }
}
