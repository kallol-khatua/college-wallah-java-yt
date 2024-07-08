class TwoDimensionalArray {
    static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] arrayMultiplication(int[][] arr_1, int r1, int c1, int[][] arr_2, int r2, int c2) {
        int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) {
                    ans[i][j] += arr_1[i][k] * arr_2[k][j];
                }
            }
        }
        return ans;
    }
}

public class JAVA_20_2D_Array {
    public static void main(String[] args) {
        // size of column is not mandatory - but row is mandatory
        int[][] arr_1 = new int[5][];

        int[][] arr_2 = {
                {1, 2, 3},
                {2, 4, 7}
        };


//        array multiplication
        int[][] arr_3 = {
                {1, 2},
                {2, 3}
        };

        int[][] arr_4 = {
                {2, 1},
                {4, 1}
        };

        int[][] ans = TwoDimensionalArray.arrayMultiplication(arr_3, 2, 2, arr_4, 2, 2);
        TwoDimensionalArray.print2dArray(ans);

    }
}
