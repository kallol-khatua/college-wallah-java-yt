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
        for(int i = 0; i < arr.length; i++) {
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

    static void rotate90Degree(int[][] arr) {
//        transpose
        transposeInPlace(arr);

//        reverse each row
        reverseRow(arr);
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


//        rotate square matrix by 90 degree
        int[][] arr_3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        TwoDimensionalArrayPractice.print2dArray(arr_3);
        TwoDimensionalArrayPractice.rotate90Degree(arr_3);
        System.out.println();
        TwoDimensionalArrayPractice.print2dArray(arr_3);
    }
}
