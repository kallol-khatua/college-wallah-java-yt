import java.io.StringReader;

class ArraysExample {
    static void demoArrays() {
        int[] arr = new int[3];
        float[] floatArr = new float[3];
        String[] stArr = {"sync", "delfcn", "slide"};  // array literal

        System.out.println(arr.length);
        System.out.println(floatArr.length);
        System.out.println(stArr.length);

        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

//        arr[5] = 2; // out of bound error

        floatArr[0] = 3.5f;
        floatArr[1] = 5.8f;

//        one dimensional array declaration
        int[] array = new int[3];
//        or
        int[] array2 = {2, 4, 6};
    }

    static void multiArray() {
        int[][] arr_1 = new int[2][3];
        int[][] arr = {{2, 4, 6}, {6, 9, 2}};  // array literal
//        System.out.printf(String.valueOf(arr[0][0]));  // wrap in string
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

//        conversion of int to string
        int a = 4;
        String str = String.valueOf(a);
        System.out.println(str);

//        three-dimensional array
        int[][][] threeArr = new int[2][4][4];
        threeArr[0][0][0] = 2;
        System.out.println(threeArr[0][0][0]);
    }

    static void traverseArray() {
        int[] arr = new int[5];

//        using for loop
        System.out.println("using for loop");
//        usually we write i < n not i <= n-1
//        for dynamic size we use length operator
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        using forEach loop
        System.out.println("Using for each loop");
        for (int element : arr) {
            System.out.println(element);
        }

//        using while loop
        System.out.println("Using while loop");
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }

//        traverse multi dimensional array
        System.out.println("Traverse multi dimensional array");
        int[][] multiArr = {{2, 4, 8}, {5, 2, 7}};
        for (int k = 0; k < multiArr.length; k++) {
            for (int j = 0; j < multiArr[k].length; j++) {
                System.out.print(multiArr[k][j] + " ");
            }
            System.out.println();
        }
    }


    static void sumOfElements() {
//        question - 1
//        calculate sum of all the element of an array
        int[] arr = {2, 6, 1, 8, 2};
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        System.out.println("The sum = " + sum);
    }

    static int searchElement(int x) {
//        question - 2  -- this is also example of linear search
//         a given element in an array if present then return index else return -1 (first occurrence)
        int[] arr = {1, 5, 3};
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}

public class JAVA_14_Arrays {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
//        obj.demoArrays();

//        obj.multiArray();

//        obj.traverseArray();

//        question - 1
//        calculate sum of all the element of an array
//        obj.sumOfElements();

//        question - 2
//        search a given element in an array if present then return index else return -1 (first occurrence)
        System.out.println(obj.searchElement(7));

    }
}
