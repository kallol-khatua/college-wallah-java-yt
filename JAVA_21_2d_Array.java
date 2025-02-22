import java.util.Scanner;

class TwoDimensionalArrayPractice {
    static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] arr, int r, int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }

    static void transposeInPlace(int[][] arr) {
//        check for square matrix

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverseRow(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = 0, k = arr[i].length - 1;
            while (j < k) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                j++;
                k--;
            }
        }
    }

    static void reverseColumn(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            int j = 0, k = arr.length - 1;
            while (j < k) {
                int temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
                j++;
                k--;
            }
        }
    }

    static void rotate90DegreeClockWise(int[][] arr) {
//        transpose
        transposeInPlace(arr);

//        reverse each row
        reverseRow(arr);
    }

    static void rotate90DegreeAntiClockWise(int[][] arr) {
//        transpose
        transposeInPlace(arr);

//        reverse each column
        reverseColumn(arr);
    }

    static int[][] pascalTriangle(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];
//            for (int j = 0; j < i + 1; j++) {
//                if (j == 0 || j == i) {
//                    ans[i][j] = 1;
//                } else {
//                    ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
//                }
//            }

            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

}

public class JAVA_21_2d_Array {
    public static void main(String[] args) {
        int[][] arr_1 = {
                {1, 2, 3},
                {4, 1, 3}
        };
//        int[][] ans = TwoDimensionalArrayPractice.findTranspose(arr_1, 2, 3);
//        TwoDimensionalArrayPractice.print2dArray(ans);


        int[][] arr_2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        TwoDimensionalArrayPractice.print2dArray(arr_2);
//        TwoDimensionalArrayPractice.transposeInPlace(arr_2);
//        System.out.println();
//        TwoDimensionalArrayPractice.print2dArray(arr_2);


//        rotate square matrix by 90 degree clock wise
        int[][] arr_3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        TwoDimensionalArrayPractice.print2dArray(arr_3);
//        TwoDimensionalArrayPractice.rotate90DegreeClockWise(arr_3);
//        System.out.println();
//        TwoDimensionalArrayPractice.print2dArray(arr_3);


//        rotate square matrix by 90 degree anti-clock wise
//        TwoDimensionalArrayPractice.print2dArray(arr_3);
//        TwoDimensionalArrayPractice.rotate90DegreeAntiClockWise(arr_3);
//        System.out.println();
//        TwoDimensionalArrayPractice.print2dArray(arr_3);


//        pascal's
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        int[][] pascalTriangle = TwoDimensionalArrayPractice.pascalTriangle(n);
        TwoDimensionalArrayPractice.print2dArray(pascalTriangle);
    }
}
